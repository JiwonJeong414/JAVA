import java.util.*;
import java.io.*;

public class cowntagion {
    static int V, E;
    static int days;

    public static void main(String[] args) throws Exception {
        // Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("cowntagion.in"));

        V = in.nextInt();
        E = V - 1;

        int[] ar = new int[V + 1];

        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            ar[a]++;
            ar[b]++;
        }

        for (int i = 1; i <= V; i++) {
            int cnt = 1;
            int cnt2 = 0;
            int numN = (i == 1) ? ar[i] : ar[i] - 1;
            while (cnt < numN + 1) {
                cnt = cnt * 2;
                cnt2++;
            }
            days += cnt2;
            days += numN;
        }
        System.out.println(days);
    }
}