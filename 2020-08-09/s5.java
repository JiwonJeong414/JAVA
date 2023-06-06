import java.util.*;
import java.io.*;

class s5 {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("input1.in"));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[][] grid = new int[r][c];
        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(f.readLine());
            for (int j = 0; j < c; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(islandPerimeter(grid));
    }

    static public int islandPerimeter(int[][] grid) {
        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int a = grid.length - 1;
                int b = grid[i].length - 1;
                if (grid[i][j] == 1) {
                    if (a == 0 && b == 0) {
                        return 4;
                    }
                    if (a == 0 && b > 0) {
                        if (j > 0 && j < b) {
                            if (grid[i][j + 1] != 1 && grid[i][j - 1] != 1) {
                                cnt = cnt + 4;
                            }
                            if ((grid[i][j + 1] != 1 && grid[i][j - 1] != 0)
                                    || (grid[i][j + 1] != 0 && grid[i][j - 1] != 1)) {
                                cnt = cnt + 3;
                            }
                            if (grid[i][j + 1] != 0 && grid[i][j - 1] != 0) {
                                cnt = cnt + 2;
                            }
                        }
                        if (j == 0) {
                            if (grid[i][j + 1] != 1) {
                                cnt = cnt + 4;
                            }
                            if (grid[i][j + 1] != 0) {
                                cnt = cnt + 3;
                            }
                        }
                        if (j == b) {
                            if (grid[i][j - 1] != 1) {
                                cnt = cnt + 4;
                            }
                            if (grid[i][j - 1] != 0) {
                                cnt = cnt + 3;
                            }
                        }
                    }
                    if (a > 0 && b == 0) {
                        if (i > 0 && i < a) {
                            if (grid[i + 1][j] != 1 && grid[i - 1][j] != 1) {
                                cnt = cnt + 4;
                            }
                            if ((grid[i + 1][j] != 1 && grid[i - 1][j] != 0)
                                    || (grid[i + 1][j] != 0 && grid[i - 1][j] != 1)) {
                                cnt = cnt + 3;
                            }
                            if (grid[i + 1][j] != 0 && grid[i - 1][j] != 0) {
                                cnt = cnt + 2;
                            }
                        }
                        if (i == 0) {
                            if (grid[i + 1][j] != 1) {
                                cnt = cnt + 4;
                            }
                            if (grid[i + 1][j] != 0) {
                                cnt = cnt + 3;
                            }
                        }
                        if (i == a) {
                            if (grid[i - 1][j] != 1) {
                                cnt = cnt + 4;
                            }
                            if (grid[i - 1][j] != 0) {
                                cnt = cnt + 3;
                            }
                        }
                    }
                    if (a > 0 && b > 0) {
                        if (i == 0 && j == 0) {
                            if (grid[i][j + 1] != 1 && grid[i + 1][j] != 1) {
                                cnt = cnt + 4;
                            }
                            if ((grid[i][j + 1] != 1 && grid[i + 1][j] != 0)
                                    || (grid[i][j + 1] != 0 && grid[i + 1][j] != 1)) {
                                cnt = cnt + 3;
                            }
                            if (grid[i][j + 1] != 0 && grid[i + 1][j] != 0) {
                                cnt = cnt + 2;
                            }
                        }
                        if (i == a && j == 0) {
                            if (grid[i][j + 1] != 1 && grid[i - 1][j] != 1) {
                                cnt = cnt + 4;
                            }
                            if ((grid[i][j + 1] != 1 && grid[i - 1][j] != 0)
                                    || (grid[i][j + 1] != 0 && grid[i - 1][j] != 1)) {
                                cnt = cnt + 3;
                            }
                            if (grid[i][j + 1] != 0 && grid[i - 1][j] != 0) {
                                cnt = cnt + 2;
                            }
                        }
                        if (i == 0 && j == b) {
                            if (grid[i][j - 1] != 1 && grid[i + 1][j] != 1) {
                                cnt = cnt + 4;
                            }
                            if ((grid[i][j - 1] != 1 && grid[i + 1][j] != 0)
                                    || (grid[i][j - 1] != 0 && grid[i + 1][j] != 1)) {
                                cnt = cnt + 3;
                            }
                            if (grid[i][j - 1] != 0 && grid[i + 1][j] != 0) {
                                cnt = cnt + 2;
                            }
                        }
                        if (i == a && j == b) {
                            if (grid[i][j - 1] != 1 && grid[i - 1][j] != 1) {
                                cnt = cnt + 4;
                            }
                            if ((grid[i][j - 1] != 1 && grid[i - 1][j] != 0)
                                    || (grid[i][j - 1] != 0 && grid[i - 1][j] != 1)) {
                                cnt = cnt + 3;
                            }
                            if (grid[i][j - 1] != 0 && grid[i - 1][j] != 0) {
                                cnt = cnt + 2;
                            }
                        }
                        if (i == 0 && j > 0 && j < b) {
                            if (grid[i][j - 1] != 1 && grid[i][j + 1] != 1 && grid[i + 1][j] != 1) {
                                cnt = cnt + 4;
                            }
                            if ((grid[i][j - 1] != 1 && grid[i][j + 1] != 1 && grid[i + 1][j] != 0)
                                    || (grid[i][j - 1] != 1 && grid[i][j + 1] != 0 && grid[i + 1][j] != 1)
                                    || (grid[i][j - 1] != 0 && grid[i][j + 1] != 1 && grid[i + 1][j] != 1)) {
                                cnt = cnt + 3;
                            }
                            if ((grid[i][j - 1] != 1 && grid[i][j + 1] != 0 && grid[i + 1][j] != 0)
                                    || (grid[i][j - 1] != 0 && grid[i][j + 1] != 1 && grid[i + 1][j] != 0)
                                    || (grid[i][j - 1] != 0 && grid[i][j + 1] != 0 && grid[i + 1][j] != 1)) {
                                cnt = cnt + 2;
                            }
                            if (grid[i][j - 1] != 0 && grid[i][j + 1] != 0 && grid[i + 1][j] != 0) {
                                cnt = cnt + 1;
                            }
                        }
                        if (i < a && i > 0 && j == 0) {
                            if (grid[i - 1][j] != 1 && grid[i][j + 1] != 1 && grid[i + 1][j] != 1) {
                                cnt = cnt + 4;
                            }
                            if ((grid[i - 1][j] != 1 && grid[i][j + 1] != 1 && grid[i + 1][j] != 0)
                                    || (grid[i - 1][j] != 1 && grid[i][j + 1] != 0 && grid[i + 1][j] != 1)
                                    || (grid[i - 1][j] != 0 && grid[i][j + 1] != 1 && grid[i + 1][j] != 1)) {
                                cnt = cnt + 3;
                            }
                            if ((grid[i - 1][j] != 1 && grid[i][j + 1] != 0 && grid[i + 1][j] != 0)
                                    || (grid[i - 1][j] != 0 && grid[i][j + 1] != 1 && grid[i + 1][j] != 0)
                                    || (grid[i - 1][j] != 0 && grid[i][j + 1] != 0 && grid[i + 1][j] != 1)) {
                                cnt = cnt + 2;
                            }
                            if (grid[i - 1][j] != 0 && grid[i][j + 1] != 0 && grid[i + 1][j] != 0) {
                                cnt = cnt + 1;
                            }
                        }
                        if (i == a && j > 0 && j < b) {
                            if (grid[i][j - 1] != 1 && grid[i][j + 1] != 1 && grid[i - 1][j] != 1) {
                                cnt = cnt + 4;
                            }
                            if ((grid[i][j - 1] != 1 && grid[i][j + 1] != 1 && grid[i - 1][j] != 0)
                                    || (grid[i][j - 1] != 1 && grid[i][j + 1] != 0 && grid[i - 1][j] != 1)
                                    || (grid[i][j - 1] != 0 && grid[i][j + 1] != 1 && grid[i - 1][j] != 1)) {
                                cnt = cnt + 3;
                            }
                            if ((grid[i][j - 1] != 1 && grid[i][j + 1] != 0 && grid[i - 1][j] != 0)
                                    || (grid[i][j - 1] != 0 && grid[i][j + 1] != 1 && grid[i - 1][j] != 0)
                                    || (grid[i][j - 1] != 0 && grid[i][j + 1] != 0 && grid[i - 1][j] != 1)) {
                                cnt = cnt + 2;
                            }
                            if (grid[i][j - 1] != 0 && grid[i][j + 1] != 0 && grid[i - 1][j] != 0) {
                                cnt = cnt + 1;
                            }
                        }

                        if (i > 0 && j == b && i < a) {
                            if (grid[i][j - 1] != 1 && grid[i - 1][j] != 1 && grid[i + 1][j] != 1) {
                                cnt = cnt + 4;
                            }
                            if ((grid[i][j - 1] != 1 && grid[i - 1][j] != 1 && grid[i + 1][j] != 0)
                                    || (grid[i][j - 1] != 1 && grid[i - 1][j] != 0 && grid[i + 1][j] != 1)
                                    || (grid[i][j - 1] != 0 && grid[i - 1][j] != 1 && grid[i + 1][j] != 1)) {
                                cnt = cnt + 3;
                            }
                            if ((grid[i][j - 1] != 1 && grid[i - 1][j] != 0 && grid[i + 1][j] != 0)
                                    || (grid[i][j - 1] != 0 && grid[i - 1][j] != 1 && grid[i + 1][j] != 0)
                                    || (grid[i][j - 1] != 0 && grid[i - 1][j] != 0 && grid[i + 1][j] != 1)) {
                                cnt = cnt + 2;
                            }
                            if (grid[i][j - 1] != 0 && grid[i - 1][j] != 0 && grid[i + 1][j] != 0) {
                                cnt = cnt + 1;
                            }
                        }
                        if (i > 0 && j > 0 && i < a && j < b) {
                            if (grid[i][j - 1] != 1 && grid[i][j + 1] != 1 && grid[i - 1][j] != 1
                                    && grid[i + 1][j] != 1) {
                                cnt = cnt + 4;
                            }
                            if ((grid[i][j - 1] != 1 && grid[i][j + 1] != 1 && grid[i - 1][j] != 1
                                    && grid[i + 1][j] != 0)
                                    || (grid[i][j - 1] != 1 && grid[i][j + 1] != 1 && grid[i - 1][j] != 0
                                            && grid[i + 1][j] != 1)
                                    || (grid[i][j - 1] != 1 && grid[i][j + 1] != 0 && grid[i - 1][j] != 1
                                            && grid[i + 1][j] != 1)
                                    || (grid[i][j - 1] != 0 && grid[i][j + 1] != 1 && grid[i - 1][j] != 1
                                            && grid[i + 1][j] != 1)) {
                                cnt = cnt + 3;
                            }
                            if ((grid[i][j - 1] != 1 && grid[i][j + 1] != 1 && grid[i - 1][j] != 0
                                    && grid[i + 1][j] != 0)
                                    || (grid[i][j - 1] != 1 && grid[i][j + 1] != 0 && grid[i - 1][j] != 1
                                            && grid[i + 1][j] != 0)
                                    || (grid[i][j - 1] != 1 && grid[i][j + 1] != 0 && grid[i - 1][j] != 0
                                            && grid[i + 1][j] != 1)
                                    || (grid[i][j - 1] != 0 && grid[i][j + 1] != 1 && grid[i - 1][j] != 1
                                            && grid[i + 1][j] != 0)
                                    || (grid[i][j - 1] != 0 && grid[i][j + 1] != 1 && grid[i - 1][j] != 0
                                            && grid[i + 1][j] != 1)
                                    || (grid[i][j - 1] != 0 && grid[i][j + 1] != 0 && grid[i - 1][j] != 1
                                            && grid[i + 1][j] != 1)) {
                                cnt = cnt + 2;
                            }
                            if ((grid[i][j - 1] != 1 && grid[i][j + 1] != 0 && grid[i - 1][j] != 0
                                    && grid[i + 1][j] != 0)
                                    || (grid[i][j - 1] != 0 && grid[i][j + 1] != 1 && grid[i - 1][j] != 0
                                            && grid[i + 1][j] != 0)
                                    || (grid[i][j - 1] != 0 && grid[i][j + 1] != 0 && grid[i - 1][j] != 1
                                            && grid[i + 1][j] != 0)
                                    || (grid[i][j - 1] != 0 && grid[i][j + 1] != 0 && grid[i - 1][j] != 0
                                            && grid[i + 1][j] != 1)) {
                                cnt = cnt + 1;
                            }
                            if (grid[i][j - 1] != 0 && grid[i][j + 1] != 0 && grid[i - 1][j] != 0
                                    && grid[i + 1][j] != 0) {
                                cnt = cnt + 0;
                            }
                        }
                    }
                }
            }
        }
        return cnt;
    }
}