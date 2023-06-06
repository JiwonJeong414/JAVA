
/*
ID: jiwonje2
LANG: JAVA
TASK: combo
*/
import java.util.*;
import java.io.*;

class combo {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("combo.in"));
        PrintWriter out = new PrintWriter(new FileWriter("combo.out"));

        int N = Integer.parseInt(f.readLine());

        StringTokenizer st = new StringTokenizer(f.readLine());
        int[] farmer = new int[3];
        for (int i = 0; i < 3; i++) {
            farmer[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(f.readLine());
        int[] master = new int[3];
        for (int i = 0; i < 3; i++) {
            master[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        for (int a = 1; a <= N; a++) {
            if ((a <= farmer[0] + 2 && a >= farmer[0] - 2) || (farmer[0] == 1 && a >= (N - 1))
                    || (farmer[0] == 2 && a == N) || (farmer[0] >= (N - 1) && a == 1) || (farmer[0] == N && a == 2)) {
                cnt1++;
            }
            if ((a <= master[0] + 2 && a >= master[0] - 2)
                    || (master[0] == 1 && a >= (N - 1) || (master[0] == 2 && a == N))
                    || (master[0] >= (N - 1) && a == 1) || (master[0] == N && a <= 2)) {
                cnt2++;
            }
            for (int b = 1; b <= N; b++) {
                if ((b <= farmer[1] + 2 && b >= farmer[1] - 2) || (farmer[1] == 1 && b >= (N - 1))
                        || (farmer[1] == 2 && b == N) || (farmer[1] >= (N - 1) && b == 1)
                        || (farmer[1] == N && b == 2)) {
                    cnt1++;
                }
                if ((b <= master[1] + 2 && b >= master[1] - 2)
                        || (master[1] == 1 && b >= (N - 1) || (master[1] == 2 && b == N))
                        || (master[1] >= (N - 1) && b == 1) || (master[1] == N && b <= 2)) {
                    cnt2++;
                }
                for (int c = 1; c <= N; c++) {
                    if ((c <= farmer[2] + 2 && c >= farmer[2] - 2) || (farmer[2] == 1 && c >= (N - 1))
                            || (farmer[2] == 2 && c == N) || (farmer[2] >= (N - 1) && c == 1)
                            || (farmer[2] == N && c == 2)) {
                        cnt1++;
                    }
                    if ((c <= master[2] + 2 && c >= master[2] - 2)
                            || (master[2] == 1 && c >= (N - 1) || (master[2] == 2 && c == N))
                            || (master[2] >= (N - 1) && c == 1) || (master[2] == N && c <= 2)) {
                        cnt2++;
                    }
                    if (cnt1 == 3 || cnt2 == 3) {
                        cnt++;
                        System.out.println(a + "," + b + "," + c);
                    }
                    if ((c <= farmer[2] + 2 && c >= farmer[2] - 2) || (farmer[2] == 1 && c >= (N - 1))
                            || (farmer[2] == 2 && c == N) || (farmer[2] >= (N - 1) && c == 1)
                            || (farmer[2] == N && c == 2)) {
                        cnt1--;
                    }
                    if ((c <= master[2] + 2 && c >= master[2] - 2)
                            || (master[2] == 1 && c >= (N - 1) || (master[2] == 2 && c == N))
                            || (master[2] >= (N - 1) && c == 1) || (master[2] == N && c <= 2)) {
                        cnt2--;
                    }
                }
                if ((b <= farmer[1] + 2 && b >= farmer[1] - 2) || (farmer[1] == 1 && b >= (N - 1))
                        || (farmer[1] == 2 && b == N) || (farmer[1] >= (N - 1) && b == 1)
                        || (farmer[1] == N && b == 2)) {
                    cnt1--;
                }
                if ((b <= master[1] + 2 && b >= master[1] - 2)
                        || (master[1] == 1 && b >= (N - 1) || (master[1] == 2 && b == N))
                        || (master[1] >= (N - 1) && b == 1) || (master[1] == N && b <= 2)) {
                    cnt2--;
                }
            }
            if ((a <= farmer[0] + 2 && a >= farmer[0] - 2) || (farmer[0] == 1 && a >= (N - 1))
                    || (farmer[0] == 2 && a == N) || (farmer[0] >= (N - 1) && a == 1) || (farmer[0] == N && a == 2)) {
                cnt1--;
            }
            if ((a <= master[0] + 2 && a >= master[0] - 2)
                    || (master[0] == 1 && a >= (N - 1) || (master[0] == 2 && a == N))
                    || (master[0] >= (N - 1) && a == 1) || (master[0] == N && a <= 2)) {
                cnt2--;
            }

        }

        out.println(cnt);
        out.close();
    }
}