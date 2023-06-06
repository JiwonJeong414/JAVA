import java.util.*;
import java.io.*;

public class knapsack {
    public static void main(String[] args) throws Exception {
        // Scanner in = new Scanner(new File("knapsack.in"));
        Scanner in = new Scanner(System.in);

        int bagsize = in.nextInt();
        int nitems = in.nextInt();

        int dp[][] = new int[nitems + 1][bagsize + 1];

        LinkedList<Integer> adj[] = new LinkedList[nitems + 1];

        for (int i = 1; i <= nitems; i++)
            adj[i] = new LinkedList<>();

        for (int i = 1; i <= nitems; i++) {
            adj[i].add(in.nextInt());
            adj[i].add(in.nextInt());
        }

        for (int r = 1; r <= nitems; r++) {
            for (int c = 1; c <= bagsize; c++) {
                int newprice = 0;
                int a = adj[r].get(0);
                int b = adj[r].get(1);
                if (a <= c) {
                    newprice = dp[r - 1][c - a] + b;
                }
                dp[r][c] = Math.max(dp[r - 1][c], newprice);
            }
        }

        System.out.println(dp[nitems][bagsize]);
    }
}
