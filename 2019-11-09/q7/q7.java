import java.io.*;
import java.util.*;

class q7 {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("q7.in"));
        PrintWriter out = new PrintWriter(new FileWriter("q7.out"));

        int N = Integer.parseInt(f.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        double min = 100;
        String cow = "";
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            String key = st.nextToken();
            double M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(f.readLine());
            int sum = 0;
            for (int j = 0; j < M; j++) {
                sum += Integer.parseInt(st.nextToken());
                map.put(key, map.getOrDefault(key, 0) + sum);
            }
            if ((sum / M) < min) {
                min = sum / M;
                cow = key;
            }
        }
        System.out.println(cow);
        System.out.println(min);
        out.println(cow);
        out.println(min);
        out.close();
    }
}