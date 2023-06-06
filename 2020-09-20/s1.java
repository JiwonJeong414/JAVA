import java.util.*;
import java.io.*;

public class s1 {
    static int[][] ps;

    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("s1.in"));
        int[][] ar = new int[5][5];
        for (int i = 1; i <= 4; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            for (int j = 1; j <= 4; j++) {
                ar[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        ps = new int[5][5];
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                ps[i][j] = ar[i][j] + ps[i - 1][j] + ps[i][j - 1] - ps[i - 1][j - 1];
            }
        }
        for (int[] row : ar) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
        for (int[] row : ps) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println(rangeSum(1, 1, 2, 2));
    }

    public static int rangeSum(int r0, int c0, int r1, int c1) {
        return ps[r1 + 1][c1 + 1] - ps[r1 + 1][c0] - ps[r0][c1 + 1] + ps[r0][r0];
    }
}
