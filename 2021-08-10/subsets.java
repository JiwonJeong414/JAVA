import java.util.*;
import java.io.*;

class subsets {
    static int[] ar = { 1, 2, 3 };
    static int cnt;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        solve(0, 0);
        System.out.println(cnt);
    }

    static void solve(int i, int path) {
        if (path > 4) {
            cnt++;
        }

        if (i == ar.length) {
            System.out.println(path);
            return; // return
        }

        // include ar[i]
        solve(i + 1, path + ar[i]);

        // not include ar[i]
        solve(i + 1, path);
    }
}
