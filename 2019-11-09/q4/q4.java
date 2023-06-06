import java.io.*;
import java.util.*;

class q4 {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("q4.in"));
        PrintWriter out = new PrintWriter(new FileWriter("q4.out"));

        StringTokenizer st = new StringTokenizer(f.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int max = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(f.readLine());
            int sum = 0;
            for (int j = 0; j < M; j++) {
                sum += Integer.parseInt(st.nextToken());
                if (sum > max) {
                    max = sum;
                }
            }
        }
        out.println(max);
        int answer = max / M;
        System.out.println(answer);
        out.println(answer);
        out.close();
    }
}