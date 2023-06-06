import java.util.*;
import java.io.*;

class s1 {
    static int[][] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("input.in"));
        StringTokenizer st = new StringTokenizer(f.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        lcs(a.toCharArray(), b.toCharArray());
    }

    static void lcs(char[] a, char[] b) {
        dp = new int[a.length + 1][b.length + 1];
        for (int i = 1; i <= a.length; i++) {
            for (int j = 1; j <= b.length; j++) {
                if (a[i - 1] == b[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        for (int i = 0; i <= a.length; i++) {
            for (int j = 0; j <= b.length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        int i = a.length;
        int j = b.length;
        String answer = "";
        char[] v;
        while (i > 0 || j > 0) {
            if (i > 0 && j > 0 && a[i - 1] == b[j - 1]) {
                System.out.print(a[i - 1]);
                i--;
                j--;
            } else if (j == 0 || dp[i - 1][j] == dp[i][j]) {
                System.out.print(a[i - 1]);
                i--;
            } else {
                System.out.print(a[j - 1]);
                j--;
            }
        }
        System.out.println(answer);
    }
}