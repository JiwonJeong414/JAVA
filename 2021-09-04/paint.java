import java.util.*;
import java.io.*;

public class paint {
    static int[][] ar;
    static int N;
    static int cnt = 2;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("dfs3.in"));

        N = in.nextInt();
        ar = new int[N][N];

        // popularize
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                ar[i][j] = in.nextInt();
            }
            System.out.println(Arrays.toString(ar[i]));
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (ar[i][j] == 0) {
                    printar();
                    cnt++;
                    System.out.println("size: " + floodfill(i, j));
                }
            }
        }

    }

    static void printar() {
        System.out.println();
        for (int i = 0; i < N; i++)
            System.out.println(Arrays.toString(ar[i]));
    }

    static int[] updown = { 1, -1, 0, 0 };
    static int[] rightleft = { 0, 0, 1, -1 };

    static int floodfill(int r, int c) { // change to int

        ar[r][c] = cnt;
        int cnt2 = 1;
        for (int i = 0; i < 4; i++) {
            int rr = r + updown[i];
            int cc = c + rightleft[i];
            if (rr < 0 || cc < 0 || rr >= N || cc >= N)
                continue;
            if (ar[rr][cc] == 1) // wall
                continue;
            if (ar[rr][cc] >= 2) // visited
                continue;

            cnt2 += floodfill(rr, cc);
        }
        return cnt2;
    }
}
