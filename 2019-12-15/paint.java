import java.util.*;
import java.io.*;

class paint {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("paint.in"));
        PrintWriter out = new PrintWriter(new FileWriter("paint.out"));

        StringTokenizer st = new StringTokenizer(f.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(f.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int count = 0;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        for (int i = 0; i < 100; i++) {
            if ((i >= a && i < b) || (i >= c && i < d)) {
                count++;
            }
        }
        out.println(count);
        out.close();
    }
}