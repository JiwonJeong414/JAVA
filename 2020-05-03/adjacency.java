import java.io.*;
import java.util.*;

public class adjacency {
    static List<List<Integer>> adj = new ArrayList<>();

    static int V, E;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("adjacency.in"));
        V = sc.nextInt();
        E = sc.nextInt();

        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < E; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        System.out.println(adj);

        dfs(0, 0);

        System.out.println(canReach(2, 2, 8));
        System.out.println(canReach(2, 2, 16));

        System.out.println(getSize(0, 0)); // 9

    }

    static int getSize(int u, int from) {
        int cnt = 1;
        for (int v : adj.get(u)) {
            if (v != from)
                cnt += getSize(v, u);
        }
        return cnt;
    }

    static boolean canReach(int u, int from, int dest) {
        if (u == dest)
            return true;

        for (int v : adj.get(u)) {
            if (v != from)
                if (canReach(v, u, dest))
                    return true;
        }
        return false;
    }

    static void dfs(int u, int from) {
        for (int v : adj.get(u))
            if (v != from)
                dfs(v, u);
    }
}