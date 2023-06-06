import java.util.*;
import java.io.*;

class lemonade {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("lemonade.in"));
        PrintWriter out = new PrintWriter(new FileWriter("lemonade.out"));

        int V = in.nextInt();
        int[] ar = new int[V];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = in.nextInt();
        }

        Arrays.sort(ar);
        V--;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < V) {
                V--;
                continue;
            } else {
                break;
            }
        }
        out.println(++V);
        out.close();
    }
}
