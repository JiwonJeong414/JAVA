import java.util.*;
import java.io.*;

public class dancemooves {
    static int[] last;

    public static void main(String[] args) throws Exception {
        // Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("dancemooves.in"));

        int N = in.nextInt();
        int K = in.nextInt();

        int[][] ar = new int[K + 1][N + 1];
        HashSet<Integer> set[] = new HashSet[N + 1];

        boolean[] count = new boolean[N + 1];

        for (int i = 0; i <= N; i++)
            ar[0][i] = i;

        for (int i = 0; i < N; i++)
            System.out.println(Arrays.toString(ar[i]));

        for (int i = 1; i <= N; i++)
            set[i] = new HashSet<>();

        for (int i = 1; i <= K; i++) {
            int positionOne = in.nextInt();
            int positionTwo = in.nextInt();
            for (int j = 0; j <= N; j++)
                ar[i][j] = ar[i - 1][j];
            ar[i][positionOne] = ar[i - 1][positionTwo];
            ar[i][positionTwo] = ar[i - 1][positionOne];
            set[ar[i][positionOne]].add(positionOne);
            set[ar[i][positionTwo]].add(positionTwo);
        }

        System.out.println();

        for (int i = 0; i < ar.length; i++)
            System.out.println(Arrays.toString(ar[i]));

        last = ar[K];

        System.out.println();

        System.out.println(Arrays.toString(set));

        System.out.println();

        System.out.println(Arrays.toString(last));

        for (int i = 1; i <= N; i++) {
            solve(i);
        }
    }

    static void solve(int i) {
        int cur = i;
        do {
            System.out.println(cur);
            cur = last[cur];
        } while (cur != i);
        System.out.println("end");
    }
}
