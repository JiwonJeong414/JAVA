import java.util.*;
import java.io.*;

public class dfs2 {
    static ArrayList<Integer> adj[];
    static int V, E;
    static boolean visited[];

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("dfs2.in"));
        V = in.nextInt();
        E = V - 1;

        // initalize
        adj = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++)
            adj[i] = new ArrayList<>();
        visited = new boolean[V + 1];

        // popularize
        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            adj[a].add(b);
            adj[b].add(a);
        }

        System.out.println(Arrays.toString(visited));

        System.out.println(Arrays.toString(adj));

        dfs(1);
    }

    static void dfs(int u) {

        if (visited[u] == true) {
            return;
        }
        visited[u] = true;
        System.out.println(u);
        for (int v : adj[u]) {
            dfs(v);
        }
    }
}
