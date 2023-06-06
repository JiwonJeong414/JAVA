import java.util.*;
import java.io.*;

public class countcross {
    static int N, K, R;
    static int ar[][];
    static boolean walls[][][];

    static int TOP = 0;
    static int BOTTOM = 0;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("countcross.in"));

        N = in.nextInt();
        K = in.nextInt();
        R = in.nextInt();
        ar = new int[N + 2][N + 2];

        walls = new boolean[N][N][TOP];
        walls[2][2][0]

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (i % 2 == 1 || j % 2 == 1) {
                    ar[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println(Arrays.toString(ar[i]));
        }

        for (int j = 0; j < R; j++) {
            
        }
    }
}
