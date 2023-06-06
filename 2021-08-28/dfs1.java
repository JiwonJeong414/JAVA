import java.util.*;
import java.io.*;

public class dfs1 {
    static ArrayList<Integer> adj[];
    static int V, E;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("dfs1.in"));
        V = in.nextInt();
        E = V - 1;

        System.out.println(Arrays.toString(adj));

        adj = new ArrayList[V + 1];
        System.out.println(Arrays.toString(adj));
        for (int i = 1; i <= V; i++) {
            adj[i] = new ArrayList<>();
        }
        System.out.println(Arrays.toString(adj));
        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            adj[a].add(b);
        }
        System.out.println(Arrays.toString(adj));

        dfs(1);
    }

    static void dfs(int u) {

        System.out.println(u);
        for (int v : adj[u])
            dfs(v);
    }
}
