import java.io.*;
import java.util.*;

class q6 {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("q6.in"));
        PrintWriter out = new PrintWriter(new FileWriter("q6.out"));

        int N = Integer.parseInt(f.readLine());

        System.out.println(N);

        HashMap<String, Integer> totals = new HashMap<>();
        HashMap<String, Integer> count = new HashMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            String name = st.nextToken();
            int milk = Integer.parseInt(st.nextToken());

            System.out.println(name + " " + milk);

            totals.put(name, totals.getOrDefault(name, 0) + milk);
            count.put(name, count.getOrDefault(name, 0) + 1);
        }

        System.out.println(totals);
        System.out.println(count);

        String cow = "";
        double avg = 0;
        for (String key : totals.keySet()) {
            if (cow.equals("")) {
                cow = key;
                avg = (double) totals.get(cow) / count.get(cow);
            } else {
                if (avg < (double) totals.get(key) / count.get(key)) {
                    cow = key;
                    avg = (double) totals.get(key) / count.get(key);
                }
            }
        }
        System.out.println(cow + " " + avg);
        out.println(cow + " " + avg);
        out.close();
    }
}