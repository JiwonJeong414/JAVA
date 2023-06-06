import java.util.*;
import java.io.*;

public class dancemooves2 {

    public static void main(String[] args) throws Exception {
        // Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("dancemooves.in"));

        int N = in.nextInt();
        int K = in.nextInt();

        int[][] ar = new int[K + 1][N + 1];
        int[][] ar2 = new int[K + 1][N + 1];

        boolean[] count = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            ar2[0][i] = i;
            ar[0][i] = i;
        }

        for (int i = 1; i <= K; i++) {
            int positionOne = in.nextInt();
            int positionTwo = in.nextInt();
            for (int j = 0; j <= N; j++)
                ar[i][j] = ar[i - 1][j];
            ar[i][positionOne] = ar[i - 1][positionTwo];
            ar[i][positionTwo] = ar[i - 1][positionOne];
            int temp = positionOne;
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.println(Arrays.toString(ar[i]));
        }

        int last = 0;
        int cnt = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        int cnt4 = 0;

        // for (int i = 1; i <= N; i++) {
        // solve(i);
        // }
    }

    // static int solve(int i) {
    // while (last != i) {
    // if (cnt2 == 0) {
    // count[ar[cnt][i]] = true;
    // if (cnt == ar.length - 1) {
    // last = ar[cnt][i];
    // cnt2++;
    // }
    // cnt++;
    // } else {
    // count[ar[cnt3][last]] = true;
    // if (cnt3 == ar.length - 1) {
    // last = ar[cnt3][last];
    // cnt3 = 0;
    // }
    // cnt3++;
    // }
    // }
    // for (int j = 0; j <= N; j++) {
    // if (count[j] == true)
    // cnt4++;
    // }
    // System.out.println(cnt4);
    // cnt = 0;
    // cnt2 = 0;
    // cnt3 = 0;
    // cnt4 = 0;
    // Arrays.fill(count, false);
    // }
}
