/*
ID: jiwonje2
LANG: JAVA
TASK: crypt1
*/
import java.io.*;
import java.util.*;

class crypt1 {
    static int[] ar;

    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("crypt1.in"));
        PrintWriter out = new PrintWriter(new FileWriter("crypt1.out"));
        int N = Integer.parseInt(f.readLine());
        StringTokenizer st = new StringTokenizer(f.readLine());
        ar = new int[N];
        for (int i = 0; i < N; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0;
        for (int a = 0; a < ar.length; a++) {
            for (int b = 0; b < ar.length; b++) {
                for (int c = 0; c < ar.length; c++) {
                    for (int d = 0; d < ar.length; d++) {
                        for (int e = 0; e < ar.length; e++) {
                            if (check(ar[a], ar[b], ar[c], ar[d], ar[e])) {
                                cnt++;
                            }
                        }
                    }
                }
            }
        }
        out.println(cnt);
        out.close();
    }

    static boolean check(int a, int b, int c, int d, int e) {
        int cnt2 = 0;
        int temp = 0;
        int answer1 = ((a * 100) + (b * 10) + (c)) * e;
        int answer2 = ((a * 100) + (b * 10) + (c)) * d;
        int answer3 = ((a * 100) + (b * 10) + (c)) * ((d * 10) + (e));
        if ((answer1 < 1000)) {
            for (int i = 0; i < ar.length; i++) {
                if (ar[i] == (answer1 / 100)) {
                    temp++;
                }
                if (ar[i] == ((answer1 / 10) % 10)) {
                    temp++;
                }
                if (ar[i] == (answer1 % 10)) {
                    temp++;
                }
            }
            if (temp == 3) {
                cnt2++;
            }
        }
        temp = 0;
        if ((answer2 < 1000)) {
            for (int i = 0; i < ar.length; i++) {
                if (ar[i] == (answer2 / 100)) {
                    temp++;
                }
                if (ar[i] == ((answer2 / 10) % 10)) {
                    temp++;
                }
                if (ar[i] == (answer2 % 10)) {
                    temp++;
                }
            }
            if (temp == 3) {
                cnt2++;
            }
        }
        temp = 0;
        if ((answer3 < 10000)) {
            for (int i = 0; i < ar.length; i++) {
                if (ar[i] == (answer3 / 1000)) {
                    temp++;
                }
                if (ar[i] == ((answer3 / 100) % 10)) {
                    temp++;
                }
                if (ar[i] == ((answer3 / 10) % 10)) {
                    temp++;
                }
                if (ar[i] == (answer3 % 10)) {
                    temp++;
                }
            }
            if (temp == 4) {
                cnt2++;
            }
        }
        if (cnt2 == 3) {
            return true;
        }
        return false;
    }
}