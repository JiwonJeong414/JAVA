
/*
ID: jiwonje2
LANG: JAVA
TASK: barn1
*/
import java.util.*;
import java.io.*;

class barn1 {

    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("barn1.in"));
        PrintWriter out = new PrintWriter(new FileWriter("barn1.out"));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int M = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] stalls = new int[C];

        for (int i = 0; i < C; i++) {
            stalls[i] = Integer.parseInt(f.readLine());
        }
        Arrays.sort(stalls);
        System.out.println(Arrays.toString(stalls));
        int[] gaps = new int[C - 1];
        for (int i = 0; i < stalls.length - 1; i++) {
            gaps[i] = stalls[i + 1] - stalls[i];
        }

        System.out.println(Arrays.toString(gaps));
        Arrays.sort(gaps);
        System.out.println(Arrays.toString(gaps));

        int total = Math.min(M, C);
        for (int i = 0; i < gaps.length - M + 1; i++) {
            total += gaps[i];
        }
        out.println(total);
        out.close();
    }
}