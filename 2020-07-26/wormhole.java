
/*
ID: jiwonje2
LANG: JAVA
TASK: wormhole
*/
import java.io.*;
import java.util.*;

class wormhole {
    static int N;
    static int[] pair;
    static int[] x;
    static int[] y;
    static int[] right;
    static int total = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("wormhole.in"));
        PrintWriter out = new PrintWriter(new FileWriter("wormhole.out"));
        N = Integer.parseInt(f.readLine());
        x = new int[N + 1];
        y = new int[N + 1];
        right = new int[N + 1];
        pair = new int[N + 1];
        Arrays.fill(right, -1);
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (y[i] == y[j]) {
                    if (x[i] < x[j] && (right[i] == -1 || x[j] < x[right[i]])) {
                        right[i] = j;
                    }
                    if (x[j] < x[i] && (right[j] == -1 || x[i] < x[right[j]])) {
                        right[j] = i;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(right));
        solve();
        System.out.println(total);
        out.println(total);
        out.close();
    }

    // fv = not implemented pair value in the pair array (first value)
    public static int solve() {
        int fv = 0;
        for (fv = 1; fv <= N; fv++) {
            // checking to see if the pair is already implemented or not
            if (pair[fv] == 0) {
                break;
            }
        }
        // sv = second value
        for (int sv = fv + 1; sv <= N; sv++) {
            // if the pair array is full, it ignores this if statment
            if (pair[sv] == 0) {
                pair[fv] = sv;
                pair[sv] = fv;
                solve();
                // backtrack
                pair[fv] = 0;
                pair[sv] = 0;
            }
        }
        // when first value is greater than N, it means that the array is full
        if (fv > N) {
            System.out.println(Arrays.toString(pair));
            if (solve2() == true) {
                total++;
            }
        }
        return 0;
    }

    public static boolean solve2() {
        // iterating through each starting point
        for (int i = 1; i <= N; i++) {
            int j = i;
            // only have to jump up to n times
            for (int x = 0; x < N; x++) {
                if (right[j] == -1)
                    break;
                j = right[j];
                j = pair[j];
                if (j == i)
                    return true;
            }
        }
        return false;
    }
}