import java.util.*;
import java.io.*;

class s3 {

    static int[][] grid;
    static int cnt = 0;

    public static void main(String[] args) {
        String[] lines = { "11111", "11122", "11222", "22211" };
        grid = new int[lines.length][lines[0].length()];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = Integer.parseInt(lines[i].substring(j, j + 1));
            }
        }

        for (int[] row : grid) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();

        // based on a given starting coordinate (r,c)
        // calculate the number of adjacent values that are the same
        // as the original value

        System.out.println(fill2(3, 0, grid[3][0])); // should return 10
    }

    static int fill2(int r, int c, int val) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[r].length)
            return 0;

        if (grid[r][c] == -2 || grid[r][c] != val)
            return 0;

        grid[r][c] = -2;
        cnt++;
        fill2(r + 1, c, val);
        fill2(r, c + 1, val);
        fill2(r - 1, c, val);
        fill2(r, c - 1, val);
        return cnt;
    }
}