import java.util.*;
import java.io.*;

public class dfs3 {
    static ArrayList<Integer> adj[];
    static int V, E;
    static boolean visited[];

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("dfs3.in"));

        V = in.nextInt();
        E = in.nextInt();
        adj = new ArrayList[V + 1];
        visited = new boolean[V + 1];
        for (int i = 1; i <= V; i++)
            adj[i] = new ArrayList<>();

        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            adj[a].add(b);
            adj[b].add(a);
        }
        System.out.println(Arrays.toString(adj));

        dfs(1);
    }

    static void dfs(int u) {

        if (visited[u] == true)
            return;
        System.out.println(u);
        visited[u] = true;
        for (int v : adj[u])
            dfs(v);
    }
}
