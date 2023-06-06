import java.io.*;
import java.util.*;

class q5 {
    public static void main(String[] args) throws Exception {

        BufferedReader f = new BufferedReader(new FileReader("q5.in"));
        PrintWriter out = new PrintWriter(new FileWriter("q5.out"));

        int N = Integer.parseInt(f.readLine());

        System.out.println(N);

        HashMap<String, Integer> map = new HashMap<>();
        int sum = 0;
        String cow = "";
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            String key = st.nextToken();
            int value = Integer.parseInt(st.nextToken());
            map.put(key, map.getOrDefault(key, 0) + value);
            if (map.get(key) > sum) {
                sum = map.get(key);
                cow = key;
            }
        }

        System.out.println(map);

        System.out.println(cow + " " + sum);
    }
}