import java.util.*;
import java.io.*;

class s1 {
    static int V;
    static int E;
    static ArrayList<Integer>[] adj;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("s1.in"));
        StringTokenizer st = new StringTokenizer(f.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        adj = new ArrayList[V];
        for (int i = 0; i < V; i++)
            adj[i] = new ArrayList<>();
        visited = new boolean[V];
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(f.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }
        System.out.println(Arrays.toString(adj));

        Deque<Integer> dq = new LinkedList<>();
        dq.add(0);
        while (!dq.isEmpty()) {
            int u = dq.remove();
            // removefirst is bfs
            // removelast is dfs
            if (visited[u]) {
                continue;
            }
            System.out.println(u);
            visited[u] = true;
            for (int v : adj[u]) {
                if (!visited[v]) {
                    dq.add(v);
                }
            }
        }
    }
}
// DFS - visits all nodes O(N) - low memory usage (stack, recursion)
// Depth First Search
// BFS - visits all nodes O(N) - heavy memory usage. Shortest Path. (queue)
// Breadth First Search