import java.util.*;
import java.io.*;

public class knapsack {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("knapsack.in"));

        int s = in.nextInt();
        int max = 0;
        int weight[] = new int[s];

        for (int i = 0; i < s; i++) {
            int n = in.nextInt();
            weight[i] = n;
            max += n;
        }

        // forward dp

        int dp[][] = new int[s + 1][max + 1];

        dp[0][0] = 1;

        for (int r = 0; r < s; r++) {
            int num = weight[r];
            for (int c = 0; c < max; c++) {
                if (dp[r][c] == 1) {
                    dp[r + 1][c] = 1;
                    dp[r + 1][c + num] = 1;
                }
            }
        }

        System.out.println("Forward DP:");
        for (int[] v : dp)
            System.out.println(Arrays.toString(v));

        // backward dp

        dp = new int[s + 1][max + 1];

        dp[0][0] = 1;

        for (int r = 1; r <= s; r++) {
            int num = weight[r - 1];
            for (int c = 0; c < max + 1; c++) {
                if (dp[r - 1][c] == 1)
                    dp[r][c] = 1;
                else if (c - num >= 0 && dp[r - 1][c - num] == 1)
                    dp[r][c] = 1;
            }
        }

        System.out.println();
        System.out.println("Backward DP:");
        for (int[] v : dp)
            System.out.println(Arrays.toString(v));
    }
}
