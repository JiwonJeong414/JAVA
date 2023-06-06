import java.util.*;
import java.io.*;

public class LCS2 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("LCS.in"));

        char a[] = (" " + in.next()).toCharArray();
        char b[] = (" " + in.next()).toCharArray();
        int dp[][] = new int[a.length][b.length];

        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < b.length; j++) {
                if (a[i] == b[j])
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

        System.out.println();
        System.out.println("answer: " + dp[a.length - 1][b.length - 1]);
    }
}
