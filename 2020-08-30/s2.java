import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("input.in"));
        Queue<Integer> q = new LinkedList<>();
        int T = Integer.parseInt(f.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            int a = Integer.parseInt(st.nextToken());
            if (a == 1) {
                q.add(Integer.parseInt(st.nextToken()));
            } else if (a == 2 && q.size() > 0) {
                q.remove();
            } else {
                if (q.size() > 0) {
                    System.out.println(q.peek());
                } else {
                    System.out.println("Empty!");
                }
            }
        }
    }
}