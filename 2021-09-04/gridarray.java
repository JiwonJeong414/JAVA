import java.util.*;
import java.io.*;

public class gridarray {
    static int[][] ar;
    static int[][] ar2;
    static int N;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("dfs2.in"));
        N = in.nextInt();
        ar = new int[N][N];

        // popularize
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                ar[i][j] = in.nextInt();
            }
            System.out.println(Arrays.toString(ar[i]));
        }
        ar2 = ar;

        dfs(0, 0);
        System.out.println();
        for (int i = 0; i < N; i++)
            System.out.println(Arrays.toString(ar[i]));
        dfs2(0, 0);
        System.out.println();
        for (int i = 0; i < N; i++)
            System.out.println(Arrays.toString(ar2[i]));
    }

    static int cnt = 2;

    static void dfs(int r, int c) {
        if (r < 0 || c < 0 || r >= N || c >= N)
            return;
        if (ar[r][c] == 1) // wall
            return;
        if (ar[r][c] >= 2) // visited
            return;

        ar[r][c] = cnt++;
        dfs(r + 1, c);
        dfs(r - 1, c);
        dfs(r, c + 1);
        dfs(r, c - 1);
    }

    static int[] updown = { 1, -1, 0, 0 };
    static int[] rightleft = { 0, 0, 1, -1 };
    static int cnt2 = 2;

    static void dfs2(int r, int c) {

        ar2[r][c] = cnt2++;
        for (int i = 0; i < 4; i++) {
            int rr = r + updown[i];
            int cc = c + rightleft[i];
            if (rr < 0 || cc < 0 || rr >= N || cc >= N)
                continue;
            if (ar2[rr][cc] == 1) // wall
                continue;
            if (ar2[rr][cc] >= 2) // visited
                continue;

            dfs2(rr, cc);
        }
    }
}
