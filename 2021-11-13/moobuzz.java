import java.util.*;
import java.io.*;

class moobuzz {

    public static void main(String[] args) throws Exception {
        int[] ar = { -1, 1, 2, 4, 7, 8, 11, 13 };

        Scanner in = new Scanner(new File("moobuzz.in"));
        PrintWriter out = new PrintWriter(new FileWriter("moobuzz.out"));

        int N = in.nextInt();

        out.println(ar[(N % 8)] + (15 * (N / 8)));
        out.close();
    }
}
