import java.util.*;
import java.io.*;

public class stackez {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("stackez.in"));

        Stack<Integer> stack = new Stack<>();
        int T = Integer.parseInt(f.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            String op = st.nextToken();

            if (op.equals("1")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (op.equals("2")) {
                if (stack.size() != 0) {
                    stack.pop();
                }
            } else if (stack.size() == 0) {
                System.out.println("Empty!");
            } else {
                System.out.println(stack.peek());
            }
        }
    }
}