import java.util.*;
import java.io.*;

class s2 {
    static int[][] grid;
    static int[][] dp;
    static int N;
    static int sum;

    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("input.in"));
        N = Integer.parseInt(f.readLine());
        grid = new int[N][N];
        dp = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            for (int j = 0; j < N; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
            System.out.println(Arrays.toString(grid[i]));
        }
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (r == 0 && c == 0) {
                    dp[r][c] = grid[r][c];
                }
                if (r == 0 && c > 0) {
                    dp[r][c] = grid[r][c] + dp[r][c - 1];
                }
                if (r > 0 && c == 0) {
                    dp[r][c] = grid[r][c] + dp[r - 1][c];
                }
                if (r > 0 && c > 0) {
                    if ((grid[r][c] + dp[r][c - 1]) > (grid[r][c] + dp[r - 1][c])) {
                        dp[r][c] = grid[r][c] + dp[r][c - 1];
                    }
                    if ((grid[r][c] + dp[r][c - 1]) < (grid[r][c] + dp[r - 1][c])) {
                        dp[r][c] = grid[r][c] + dp[r - 1][c];
                    }
                    if ((grid[r][c] + dp[r][c - 1]) == (grid[r][c] + dp[r - 1][c])) {
                        dp[r][c] = grid[r][c] + dp[r - 1][c];
                    }
                }
            }
        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
    }
}