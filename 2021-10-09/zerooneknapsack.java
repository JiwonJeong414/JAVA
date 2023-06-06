import java.util.*;
import java.io.*;

public class zerooneknapsack {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("zerooneknapsack.in"));

        int bagsize = in.nextInt();
        int nitems = in.nextInt();
        int dp[][] = new int[nitems + 1][bagsize + 1];

        for (int i = 0; i <= nitems; i++)
            System.out.println(Arrays.toString(dp[i]));

        LinkedList<Integer> adj[] = new LinkedList[nitems + 1];

        for (int i = 1; i <= nitems; i++)
            adj[i] = new LinkedList<>();

        for (int i = 1; i <= nitems; i++) {
            adj[i].add(in.nextInt());
            adj[i].add(in.nextInt());
        }

        System.out.println(Arrays.toString(adj));

        for (int r = 1; r <= nitems; r++) {
            for (int c = 1; c <= bagsize; c++) {
                int newprice = 0;
                int a = adj[r].get(0);
                int b = adj[r].get(1);
                if (a <= c) {
                    System.out.println("r: " + r + " c: " + c);
                    newprice = dp[r - 1][c - a] + b;
                }
                dp[r][c] = Math.max(dp[r - 1][c], newprice);
            }
        }

        for (int i = 0; i <= nitems; i++)
            System.out.println(Arrays.toString(dp[i]));
    }
}