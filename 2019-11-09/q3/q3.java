import java.io.*;
import java.util.*;

class q3 {
    public static void main(String[] args) throws Exception {

        BufferedReader f = new BufferedReader(new FileReader("q3.in"));
        PrintWriter out = new PrintWriter(new FileWriter("q3.out"));

        int N = Integer.parseInt(f.readLine());

        StringTokenizer st = new StringTokenizer(f.readLine());

        System.out.println(N);

        int[] ar = new int[N];

        for (int i = 0; i < N; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
    }
}