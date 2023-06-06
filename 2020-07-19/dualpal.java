
/*
ID: jiwonje2
LANG: JAVA
TASK: dualpal
*/
import java.util.*;
import java.io.*;

class dualpal {
    public static void main(String[] args) throws Exception {

        BufferedReader f = new BufferedReader(new FileReader("dualpal.in"));
        PrintWriter out = new PrintWriter(new FileWriter("dualpal.out"));

        StringTokenizer st = new StringTokenizer(f.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken()) + 1;

        int cnt = 0;

        while (cnt < N) {
            int temp = 0;
            for (int base = 2; base <= 10; base++) {
                String pal = Integer.toString(S, base);
                System.out.println(pal);
                if (isPalindrome(pal))
                    temp++;
            }
            if (temp > 1) {
                out.println(S);
                cnt++;
            }
            S++;
        }

        out.close();
    }

    static boolean isPalindrome(String str) {
        System.out.println(str.length());
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}