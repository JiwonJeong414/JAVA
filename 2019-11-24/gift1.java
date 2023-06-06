
/*
ID: jiwonje2
LANG: JAVA
TASK: gift1
*/
import java.util.*;
import java.io.*;

class gift1 {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
        PrintWriter out = new PrintWriter(new FileWriter("gift1.out"));

        int p = Integer.parseInt(f.readLine());
        String[] ar = new String[p];
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < p; i++) {
            String c = f.readLine();
            map.put(c, 0);
            ar[i] = c;
        }
        for (int i = 0; i < p; i++) {
            String giver = f.readLine();
            System.out.println(giver);
            StringTokenizer st = new StringTokenizer(f.readLine());
            int money = Integer.parseInt(st.nextToken());
            int friends = Integer.parseInt(st.nextToken());
            for (int j = 0; j < friends; j++) {
                String key = f.readLine();
                map.put(key, map.getOrDefault(key, 0) + (money / friends));
                System.out.println(map);
            }
            int S = map.get(giver);
            if (money > 0) {
                map.put(giver, S - money + (money % friends));
            }
            System.out.println(map);
        }
        for (int i = 0; i < p; i++) {
            out.println(ar[i] + " " + map.get(ar[i]));
        }
        out.close();
    }
}