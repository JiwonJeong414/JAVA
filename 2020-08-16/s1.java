import java.util.*;
import java.io.*;

class s1 {
    static int[][] dp;

    public static void main(String[] args) throws Exception {
        int W = 7;
        int[] wt = { 1, 3, 4, 5 };
        int[] val = { 1, 4, 5, 7 };
        dp = new int[wt.length][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (i == 0 && j >= wt[i]) {
                    dp[i][j] = val[i];
                }
                if (i > 0 && j < wt[i]) {
                    dp[i][j] = dp[i - 1][j];
                } else if (i > 0) {
                    dp[i][j] = Math.max(dp[i - 1][j - wt[i]] + val[i], dp[i - 1][j]);
                }
            }
        }
        display();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (dp[i][j] > max) {
                    max = dp[i][j];
                }
            }
        }
        System.out.println(max);
    }

    static public void display() {
        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
    }
}