import java.util.*;
import java.io.*;

public class s1 {
    static int dp[][];

    public static void main(String args[]) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("input.in"));
        char[] a = f.readLine().toCharArray();
        char[] b = f.readLine().toCharArray();
        dp = new int[a.length + 1][b.length + 1];

        System.out.println(lcs(a, b));
    }

    static int lcs(char[] a, char[] b) {
        for (int i = 1; i <= a.length; i++) {
            for (int j = 1; j <= b.length; j++) {
                if (a[i - 1] == b[j - 1])
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        return dp[a.length][b.length];
    }
}
