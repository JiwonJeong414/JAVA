import java.util.*;
import java.io.*;

class s1 {
    public static void main(String[] args) throws Exception {
        // BufferedReader f = new BufferedReader(new FileReader("input.in"));
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(f.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(f.readLine());
            TreeMap<String, Integer> map = new TreeMap<>();
            for (int j = 0; j < n; j++) {
                String code = f.readLine();
                map.put(code, map.getOrDefault(code, 0) + 1);
            }
            for (String key : map.keySet()) {
                System.out.println(key + " " + map.get(key));
            }
            f.readLine();
            System.out.println();
        }
    }
}
