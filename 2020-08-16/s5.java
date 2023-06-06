import java.util.*;
import java.io.*;

class s5 {
    static int[] ar = new int[26];

    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("input1.in"));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(f.readLine());
        for (int i = 0; i < 26; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(ar));
        String a = f.readLine();
        String b = f.readLine();
        System.out.println(a);
        System.out.println(b);
    }
}