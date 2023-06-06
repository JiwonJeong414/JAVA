import java.util.*;
import java.io.*;

class s5 {
    public static void main(String[] args) throws Exception {
        // BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader f = new BufferedReader(new FileReader("input3.in"));
        char[] a = f.readLine().toCharArray();
        int numopening = 0;
        int numclosing = 0;
        int cnt = 0;
        int cnt2 = 0;
        int answer = 0;
        while (a != null && a[0] != '-') {
            answer = 0;
            numopening = 0;
            numclosing = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == '{') {
                    numopening++;
                } else {
                    numclosing++;
                }
            }
            int o_cnt = 0;
            int changes = 0;
            for (char c : a) {
                if (c == '{')
                    o_cnt++;
                else {
                    if (o_cnt == 0) {
                        changes++;
                        o_cnt++;
                    } else {
                        o_cnt--;
                    }
                }
            }
            System.out.println(a);
            Stack<Character> stack = new Stack<>();
            cnt++;
            cnt2 = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.length() > 0 && a.charAt(i) == '{') {
                    stack.push(a.charAt(i));
                } else {
                    if (stack.size() > 0 && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        cnt2++;
                    }
                }
            }
            System.out.println(cnt2);
            if (stack.size() == 0 && cnt2 == 0) {
                answer = stack.size();
            } else {
                if (stack.size() > 0) {
                    answer = Math.abs((numopening - numclosing) / 2 + cnt2);
                }
                if (cnt2 > 0) {
                    answer += 1;
                }
            }
            changes += o_cnt / 2;
            if (o_cnt % 2 == 1) {
                changes++;
            }
            System.out.println(changes);
            System.out.println(cnt + ". " + answer);
            a = f.readLine();
        }
    }
}