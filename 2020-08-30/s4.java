import java.util.*;
import java.io.*;

class s4 {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new LinkedList<>();
        int T = Integer.parseInt(f.readLine());
        Boolean R = false;
        String a = "toFront";
        String b = "front";
        String c = "reverse";
        String d = "back";
        String e = "push_back";
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            String query = st.nextToken();
            if (query.equals(a)) {
                if (R == false) {
                    int n = Integer.parseInt(st.nextToken());
                    dq.addFirst(n);
                } else {
                    int n = Integer.parseInt(st.nextToken());
                    dq.addLast(n);
                }
            } else if (query.equals(e)) {
                if (R == true) {
                    int n = Integer.parseInt(st.nextToken());
                    dq.addFirst(n);
                } else {
                    int n = Integer.parseInt(st.nextToken());
                    dq.addLast(n);
                }
            } else if (query.equals(b)) {
                if (R == false) {
                    if (dq.size() > 0) {
                        System.out.println(dq.removeFirst());
                    } else {
                        System.out.println("No job for Ada?");
                    }
                } else {
                    if (dq.size() > 0) {
                        System.out.println(dq.removeLast());
                    } else {
                        System.out.println("No job for Ada?");
                    }
                }
            } else if (query.equals(d)) {
                if (R == true) {
                    if (dq.size() > 0) {
                        System.out.println(dq.removeFirst());
                    } else {
                        System.out.println("No job for Ada?");
                    }
                } else {
                    if (dq.size() > 0) {
                        System.out.println(dq.removeLast());
                    } else {
                        System.out.println("No job for Ada?");
                    }
                }
            } else if (query.equals(c) && dq.size() > 0) {
                if (R == false) {
                    R = true;
                } else {
                    R = false;
                }
            }
        }
    }
}