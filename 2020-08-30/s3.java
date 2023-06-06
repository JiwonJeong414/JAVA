import java.util.*;
import java.io.*;

class s3 {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("input1.in"));
        Stack<Integer> q = new Stack<>();
        String c = "1234";
        char[] b = c.toCharArray();
        System.out.println(Arrays.toString(b));
        System.out.println(1 + ". " + 2);
        int T = Integer.parseInt(f.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            int a = Integer.parseInt(st.nextToken());
            if (a == 1) {
                q.push(Integer.parseInt(st.nextToken()));
            } else if (a == 2 && q.size() > 0) {
                q.pop();
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