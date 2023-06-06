import java.util.*;

class s1 {

    static Stack<Integer> set = new Stack<>();
    static int[] ar = { 9, 5, 2 };
    static boolean[] used = new boolean[ar.length];

    public static void main(String[] args) {
        // solve(0);
        permutation(0);
    }

    static void solve(int k) {
        if (k == ar.length) {
            System.out.println(set);
        } else {
            set.add(ar[k]);
            solve(k + 1);
            set.pop();
            solve(k + 1);
        }
    }

    static void permutation(int k) {
        if (k == ar.length) {
            System.out.println(set);
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println("i: " + i);
            System.out.println("k: " + k);
            if (used[i] == false) {
                set.add(ar[i]);
                used[i] = true;
                permutation(k + 1);
                set.pop();
                used[i] = false;
            }
        }

    }
}