import java.util.*;
import java.io.*;

class teleport {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("teleport.in"));
        PrintWriter out = new PrintWriter(new FileWriter("teleport.out"));

        StringTokenizer st = new StringTokenizer(f.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int a = Math.abs(start - y) + Math.abs(end - x);
        int b = Math.abs(start - x) + Math.abs(end - y);
        int c = Math.abs(start - end);

        if (a < b && a < c) {
            out.println(a);
        } else if (b < a && b < c) {
            out.println(b);
        } else if (c < a && c < b) {
            out.println(c);
        }
        out.close();
    }
}
