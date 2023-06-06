import java.util.*;
import java.io.*;

class s2 {
    static int[][] dp;

    public static void main(String[] args) throws Exception {
        int[] wt = { 0, 1, 3, 3, 5 };
        int N = wt.length;
        int sum = 0;
        for (int i = 0; i < wt.length; i++) {
            sum += wt[i];
        }
        int W = sum + 1;
        dp = new int[N][W];
        dp[0][0] = 1;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (dp[i - 1][j] == 1) {
                    dp[i][j] = 1;
                } else if (j >= wt[i] && dp[i - 1][j - wt[i]] == 1) {
                    dp[i][j] = 1;
                }
            }
        }
        display();
    }

    static public void display() {
        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
    }
}