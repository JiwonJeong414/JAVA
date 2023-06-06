import java.io.*;
import java.util.*;

class q1 {

    public static void main(String[] args) throws Exception {

        BufferedReader f = new BufferedReader(new FileReader("q1.in"));
        PrintWriter out = new PrintWriter(new FileWriter("q1.out"));

        int N = Integer.parseInt(f.readLine());
        System.out.println(N);

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(f.readLine());
        }

        System.out.println(sum);

        out.println(sum);
    }
}