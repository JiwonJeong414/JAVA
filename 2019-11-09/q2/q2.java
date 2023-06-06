import java.io.*;
import java.util.*;

class q2 {

    public static void main(String[] args) throws Exception {

        BufferedReader f = new BufferedReader(new FileReader("q2.in"));
        PrintWriter out = new PrintWriter(new FileWriter("q2.out"));

        int N = Integer.parseInt(f.readLine());

        StringTokenizer st = new StringTokenizer(f.readLine());

        System.out.println(N);

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(st.nextToken());
        }
        System.out.println(sum);
        out.println(sum);

        out.close();
    }
}