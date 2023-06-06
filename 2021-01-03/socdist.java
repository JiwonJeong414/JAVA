import java.util.*;
import java.io.*;

class socdist {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("socdist.in"));
        PrintWriter out = new PrintWriter(new FileWriter("socdist.out"));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
        }
        long mid = 0;
        works(mid); // quick fix
    }
}
