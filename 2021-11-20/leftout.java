import java.io.*;
import java.util.*;

class leftout {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("leftout.in"));
        PrintWriter out = new PrintWriter(new FileWriter("leftout.out"));

        int N = in.nextInt();

        char[][] ar = new char[N][N];

        for (int i = 0; i < N; i++) {
            ar[i] = in.next().toCharArray();
        }

        for (int i = N - 1; i >= 0; i--) {
            if (ar[0][i] == 'R')
                for (int j = 0; j < N; j++) {
                    if (ar[j][i] == 'L')
                        ar[j][i] = 'R';
                    else
                        ar[j][i] = 'L';
                }
        }

        System.out.println();
        for (int i = 0; i < N; i++) {
            if (ar[i][0] == 'R') {
                for (int j = 0; j < N; j++) {
                    if (ar[i][j] == 'L')
                        ar[i][j] = 'R';
                    else
                        ar[i][j] = 'L';
                }
            }
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.println(Arrays.toString(ar[i]));
        }

        int cnt = 0;
        for (int i = 1; i < N; i++)
            for (int j = 1; j < N; j++)
                if (ar[i][j] == 'R')
                    cnt++;

        System.out.println(cnt);

        if (cnt == (N - 1) * (N - 1)) {
            out.println("1 1");
            out.close();
        }

        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                if (ar[j][i] == 'R' && cnt == 1) {
                    out.println((j + 1) + " " + (i + 1));
                    out.close();
                }
            }
        }

        for (int i = 1; i < N; i++) {
            if (ar[N - 1][i] == 'R' && ar[N - 2][i] == 'R') {
                out.println("1 " + (i + 1));
                out.close();
            }
        }

        for (int i = 1; i < N; i++) {
            if (ar[i][N - 1] == 'R' && ar[i][N - 2] == 'R') {
                out.println((i + 1) + " 1");
                out.close();
            }
        }

        out.println("-1");
        out.close();
    }
}
