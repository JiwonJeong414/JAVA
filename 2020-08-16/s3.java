import java.util.*;
import java.io.*;

class s3 {
    static int[][] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("input.in"));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int S = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] size = new int[N];
        int[] value = new int[N];
        dp = new int[N][S + 1];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(f.readLine());
            size[i] = Integer.parseInt(st.nextToken());
            value[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (i == 0 && j >= size[i]) {
                    dp[i][j] = value[i];
                }
                if (i > 0 && j < size[i]) {
                    dp[i][j] = dp[i - 1][j];
                } else if (i > 0) {
                    dp[i][j] = Math.max(dp[i - 1][j - size[i]] + value[i], dp[i - 1][j]);
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
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
}