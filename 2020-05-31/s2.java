import java.util.*;
import java.io.*;

class s2 {
    static boolean[] col;
    static boolean[] row;
    static boolean[] diag1;
    static boolean[] diag2;
    static int[][] board;

    public static void main(String[] args) throws Exception {
        int n = 4;

        int max = 0;
        board = new int[n][n];
        diag1 = new boolean[n * 2 - 1];
        diag2 = new boolean[n * 2 - 1];
        col = new boolean[n];
        row = new boolean[n];

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board.length; c++) {
                board[r][c] = r + c;
            }
        }
        print2D();
        System.out.println("------------");

        for (int c = 0; c < board.length; c++) {
            for (int r = 0; r < board[0].length; r++) {
                board[r][c] = n - 1 + c - r;
            }
        }
        print2D();

        System.out.println("------------");

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board.length; c++) {
                board = new int[n][n];
                diag1 = new boolean[n * 2 - 1];
                diag2 = new boolean[n * 2 - 1];
                col = new boolean[n];
                row = new boolean[n];
                if (queen(r, c, n) > max) {
                    max = queen(r, c, n);
                }
                System.out.println("------");
            }
        }
        System.out.println(max + 1);
    }

    static int queen(int r, int c, int n) {
        int cnt = 0;
        board[r][c] = 1;
        row[r] = true;
        col[c] = true;
        diag1[r + c] = true;
        diag2[n - 1 + c - r] = true;

        for (int i = 1; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!col[j] && !row[i] && !diag1[i + j] && !diag2[n - 1 + j - i])
                    board[i][j] = 2;
                cnt++;
            }
        }
        dp();
        print2D();
        return cnt;
    }

    static void print2D() {
        for (int[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

    static void dp() {
        System.out.println(Arrays.toString(col));
        System.out.println(Arrays.toString(diag1));
        System.out.println(Arrays.toString(diag2));
    }
}