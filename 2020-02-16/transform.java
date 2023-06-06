
/*
ID: jiwonje2
LANG: JAVA
TASK: transform
*/
import java.util.*;
import java.io.*;

class transform {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("transform.in"));
        PrintWriter out = new PrintWriter(new FileWriter("transform.out"));
        int N = Integer.parseInt(f.readLine());
        char[][] ar = new char[N][N];
        char[][] ar2 = new char[N][N];
        char[][] ar3 = new char[N][N];
        for (int i = 0; i < N; i++) {
            ar[i] = f.readLine().toCharArray();
            System.out.println(Arrays.toString(ar[i]));
        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            ar2[i] = f.readLine().toCharArray();
            System.out.println(Arrays.toString(ar2[i]));
        }
        int cnt = N;
        for (int i = 0; i < N; i++) {
            cnt = N;
            for (int j = 0; j < N; j++) {
                cnt = cnt - 1;
                ar3[i][j] = ar[i][cnt];
            }
        }
        System.out.println();
        for (int i = 0; i < ar3.length; i++) {
            System.out.println(Arrays.toString(ar3[i]));
        }
        int one = N;
        int oneone = 0;
        int two = N;
        int twotwo = 0;
        int threethree = 0;
        int sixsix = 0;
        int fourfour = 0;
        int fiveone = 0;
        int fivetwo = 0;
        int fivethree = 0;
        for (int i = 0; i < N; i++) {
            two = N;
            one = one - 1;
            for (int j = 0; j < N; j++) {
                two = two - 1;
                if (ar3[i][j] == ar2[j][one]) {
                    fiveone++;
                    System.out.println("1true" + fiveone);
                }
                if (ar3[i][j] == ar2[one][two]) {
                    fivetwo++;
                    System.out.println("2true" + fivetwo);
                }
                if (ar3[i][j] == ar2[two][i]) {
                    fivethree++;
                    System.out.println("3true" + fivethree);
                }
                if (ar[i][j] == ar2[i][two]) {
                    fourfour++;
                }
                if (ar[i][j] == ar2[j][one]) {
                    oneone++;
                }
                if (ar[i][j] == ar2[one][two]) {
                    twotwo++;
                }
                if (ar[i][j] == ar2[two][i]) {
                    threethree++;
                }
                if (ar[i][j] == ar2[i][j]) {
                    sixsix++;
                }
            }
        }
        if (oneone == N * N) {
            out.println("1");
            out.close();
        }

        if (twotwo == N * N) {
            out.println("2");
            out.close();
        }

        if (threethree == N * N) {
            out.println("3");
            out.close();
        }
        if (fourfour == N * N) {
            out.println("4");
            out.close();
        }
        if (fiveone == N * N || fivetwo == N * N || fivethree == N * N) {
            out.println("5");
            out.close();
        }

        if (sixsix == N * N) {
            out.println("6");
            out.close();
        }
        out.println("7");
        out.close();
    }
}