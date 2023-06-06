import java.util.*;
import java.io.*;

class paintbarn {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("paintbarn.in"));
        PrintWriter out = new PrintWriter(new FileWriter("paintbarn.out"));

        int N = in.nextInt();
        int K = in.nextInt();
        int[][] ps = new int[10][10];

        for (int i = 0; i < N; i++) {
            int lowerx = in.nextInt();
            int lowery = in.nextInt();
            int upperx = in.nextInt();
            int uppery = in.nextInt();
            ps[lowerx][lowery]++;
            ps[upperx][lowery]--;
            ps[lowerx][uppery]--;
            ps[upperx][uppery]++;
        }
        int cnt = 0;
        for (int i = 0; i < ps.length; i++) {
            for (int j = 0; j < ps[i].length; j++) {
                if (i == 0 && j > 0)
                    ps[i][j] += ps[i][j - 1];
                else if (j == 0 && i > 0)
                    ps[i][j] += ps[i - 1][j];
                else if (i > 0 && j > 0)
                    ps[i][j] += ps[i - 1][j] + ps[i][j - 1] - ps[i - 1][j - 1];
                if (ps[i][j] == K)
                    cnt++;
            }
            System.out.println(Arrays.toString(ps[i]));
        }
        System.out.println("answer: " + cnt);
    }
}
