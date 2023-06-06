import java.util.*;
import java.io.*;

class s1 {
    static int[][] grid;
    static int[][] path;
    static int sum;
    static int sum1;
    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("input.in"));
        N = Integer.parseInt(f.readLine());
        grid = new int[N][N];
        path = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            for (int j = 0; j < N; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
            System.out.println(Arrays.toString(grid[i]));
        }
        solve(0, 0);
        System.out.println(sum1);
    }

    static void display() {
        for (int i = 0; i < path.length; i++) {
            System.out.println(Arrays.toString(path[i]));
        }
    }

    static void solve(int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length) {
            return;
        }
        sum += grid[r][c];
        path[r][c] = 1;
        if (r == N - 1 && c == N - 1) {
            if (sum > sum1) {
                sum1 = sum;
            }
        }
        solve(r + 1, c);
        solve(r, c + 1);

        if (path[r][c] == 1) {
            sum = sum - grid[r][c];
        }
        path[r][c] = 0;
    }
}