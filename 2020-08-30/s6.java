import java.util.*;
import java.io.*;

class s6 {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("input4.in"));
        int n = Integer.parseInt(f.readLine());
        while (n != 0) {
            Stack<Integer> stack = new Stack<>();
            Stack<Integer> stack2 = new Stack<>();
            int cnt = 1;
            StringTokenizer st = new StringTokenizer(f.readLine());
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(st.nextToken());
                if (cnt == a) {
                    cnt++;
                    stack.push(a);
                } else {
                    stack2.push(a);
                }
            }
            for (int i = 0; i < stack2.size() + 1; i++) {
                if (cnt == (stack2.peek())) {
                    cnt++;
                    stack.push(stack2.pop());
                }
            }
            if (cnt == n + 1) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            n = Integer.parseInt(f.readLine());
        }
    }
}
