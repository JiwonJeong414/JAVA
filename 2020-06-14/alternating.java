import java.util.*;
import java.io.*;

class alternating {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("alternating.in"));
        PrintWriter out = new PrintWriter(new FileWriter("alternating.out"));

        int t = Integer.parseInt(f.readLine());
        System.out.println(t);
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(f.readLine());
            int[] input = new int[n];
            StringTokenizer st = new StringTokenizer(f.readLine());
            for (int j = 0; j < n; j++) {
                input[j] = Integer.parseInt(st.nextToken());
                System.out.println(Arrays.toString(input));
            }
            sum(input);
        }
    }

    static void sum(int[] input) {
        int max = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i]) {

            }
        }
    }
}