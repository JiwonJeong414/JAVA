import java.util.*;
import java.io.*;

class s2 {
    static int n;

    public static void main(String[] args) throws Exception {
        // BufferedReader f = new BufferedReader(new FileReader("input1.in"));
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Integer, String> m = new TreeMap<>();
        HashMap<String, Integer> m2 = new HashMap<>();
        String c = f.readLine();
        if (c == null) {
            n = 0;
        } else {
            n = Integer.parseInt(c);
        }
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            int instruction = Integer.parseInt(st.nextToken());
            if (instruction == 1) {
                String stock = st.nextToken();
                int price = Integer.parseInt(st.nextToken());
                m.put(price, stock);
                m2.put(stock, price);
            }
            if (instruction == 2) {
                String stock = st.nextToken();
                int price = Integer.parseInt(st.nextToken());
                int a = m2.get(stock);
                m.remove(a);
                m.put(price, stock);
                m2.put(stock, price);
            }
            if (instruction == 3) {
                System.out.println(m.get(m.firstKey()) + " " + (i + 1));
                m2.remove(m.get(m.firstKey()));
                m.remove(m.firstKey());
            }
        }
    }
}
