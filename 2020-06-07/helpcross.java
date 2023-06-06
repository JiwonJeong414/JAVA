import java.util.*;
import java.io.*;

public class helpcross {
    static int[] chicken;
    static Map<Integer, Integer> cow = new HashMap<>();
    static int cnt = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("helpcross.in"));
        PrintWriter out = new PrintWriter(new FileWriter("helpcross.out"));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int c = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        chicken = new int[c];
        for (int i = 0; i < c; i++) {
            chicken[i] = Integer.parseInt(f.readLine());
        }
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(f.readLine());
            cow.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        System.out.println(cow);
        Arrays.sort(chicken);
        System.out.println(Arrays.toString(chicken));
        int cnt1 = 0;
        for (int a : cow.keySet()) {
            if (chicken[cnt1] <= cow.get(a) && chicken[cnt1] >= a) {
                cnt++;
            }
            cnt1++;
        }
        out.println(cnt);
        out.close();
    }
}