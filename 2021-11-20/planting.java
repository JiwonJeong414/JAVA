import java.io.*;
import java.util.*;

public class planting {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(new File("planting.in"));
        PrintWriter out = new PrintWriter(new FileWriter("planting.out"));

        int N = in.nextInt();

        int[] ar = new int[N + 1];

        for (int i = 1; i < N; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            ar[a]++;
            ar[b]++;
        }

        System.out.println(Arrays.toString(ar));

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max)
                max = ar[i];
        }

        out.println(max + 1);
        out.close();
    }
}
