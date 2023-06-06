import java.util.*;
import java.io.*;

class comfortablecows {

    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };

    public static void main(String[] args) throws Exception {
        // Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("comfortablecows.in"));

        int N = in.nextInt();
        Queue<String> q = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();
        int buffer = N / 2;
        int[][] ar = new int[N + buffer][N + buffer];
        int[][] ar2 = new int[N + buffer][N + buffer];

        int answer = 0;
        for (int i = 0; i < N; i++) {
            int x = in.nextInt() + buffer;
            int y = in.nextInt() + buffer;

            ar2[x][y] = 1;

            for (int j = 0; j < 4; j++) {
                int xx = x + dx[j];
                int yy = y + dy[j];

                if (++ar[xx][yy] == 3) {
                    answer++;
                    q.add(xx + " " + yy);
                }
                if (ar[xx][yy] == 4) {
                    answer--;
                    q.remove(xx + " " + yy);
                }
            }
            for (int j = 0; j < ar.length; j++) {
                System.out.println(Arrays.toString(ar[j]));
            }
            System.out.println();
            for (int j = 0; j < ar.length; j++) {
                System.out.println(Arrays.toString(ar2[j]));
            }
            System.out.println();

            int tempanswer = answer;
            while (tempanswer != 0) {
                String comfortable = q.remove();
                String[] ar3 = comfortable.split(" ");
                int xc = Integer.parseInt(ar3[0]);
                int yc = Integer.parseInt(ar3[1]);
                for (int j = 0; j < 4; j++) {
                    int xx = xc + dx[j];
                    int yy = yc + dy[j];
                    if (ar2[xx][yy] == 0) {
                        q2.add(xx + " " + yy);
                        for (int j = 0; j < 4; j++) {
                            int xm = xx + dx[j];
                            int ym = yy + dy[j];
                            if (++ar[xm][ym] == 3) {
                                answer++;
                                tempanswer++;
                                q.add(xm + " " + ym);
                            }
                            if (ar[xm][ym] == 4) {
                                tempanswer--;
                                q.remove(xm + " " + ym);
                            }
                        }
                    }
                }
            }

            System.out.println(answer);

            System.out.println(q);
        }
    }
}
