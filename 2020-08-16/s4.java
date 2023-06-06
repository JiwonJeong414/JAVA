import java.util.*;
import java.io.*;

class s4 {
    static double[][] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("knapsack.in"));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int S = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] size = new int[N];
        double[] value = new double[N];
        dp = new double[N][S + 1];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(f.readLine());
            size[i] = Integer.parseInt(st.nextToken());
            value[i] = Double.parseDouble(st.nextToken()) + 0.00;
        }
        System.out.println(0.00);
        System.out.println(Arrays.toString(size));
        System.out.println(Arrays.toString(value));
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (i == 0 && j >= size[i]) {
                    dp[i][j] = value[i];
                }
                if (i > 0 && j <= size[i]) {
                    if (value[i] < dp[i - 1][j]) {
                        dp[i][j] = value[i];
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                } else if (i > 0) {
                    dp[i][j] = Math.round(Math.min(dp[i - 1][j] + value[i], dp[i][j - 1] + value[i]) * 100.0) / 100.0;
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (dp[i][j] > max) {
                    max = dp[i][j];
                }
            }
        }
        System.out.println(max);
    }
}