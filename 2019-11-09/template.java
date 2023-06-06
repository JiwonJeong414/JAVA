import java.io.*;
import java.util.*;

class template {

    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("template.in"));
        PrintWriter out = new PrintWriter(new FileWriter("template.out"));

        // input without tokenizer

        int N = Integer.parseInt(f.readLine());
        System.out.println(N);

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(f.readLine());
        }

        System.out.println(sum);

        out.println(sum);
        // input with tokenizer

        N = Integer.parseInt(f.readLine());

        StringTokenizer st = new StringTokenizer(f.readLine());

        System.out.println(N);

        int sum2 = 0;
        for (int i = 0; i < N; i++) {
            sum2 += Integer.parseInt(st.nextToken());
        }
        System.out.println(sum);
        out.println(sum2);

        out.close();
    }
}