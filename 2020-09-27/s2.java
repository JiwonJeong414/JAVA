import java.util.*;
import java.io.*;

class s2 {
    static int V;
    static int E;
    static ArrayList<Integer>[] adj;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        // BufferedReader in = new BufferedReader(new FileReader("s2.in"));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        if (V - 1 != E) {
            System.out.println("NO");
            return;
        }
        adj = new ArrayList[V + 1];
        for (int i = 0; i <= V; i++)
            adj[i] = new ArrayList<>();
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(in.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        // --------------------------------------------------------------

        dfs(1);
        for (int i = 0; i <= V; i++) {
            if (!visited[i]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    static void dfs(int u) {
        if (visited[u]) {
            return;
        }
        visited[u] = true;
        for (int v : adj[u]) {
            dfs(v);
        }
    }
}