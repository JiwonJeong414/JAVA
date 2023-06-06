import java.util.*;

public class s2 {

    static int V, E;
    static LinkedList<Integer>[] adj;
    static boolean[] visited;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        V = in.nextInt();
        E = in.nextInt();
        adj = new LinkedList[V + 1];
        for (int i = 1; i <= V; i++)
            adj[i] = new LinkedList<>();
        visited = new boolean[V + 1];

        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            adj[a].add(b);
        }

        System.out.println(Arrays.toString(adj));

        // ========

        int ret = 0;
        for (int i = 1; i <= V; i++) {
            Deque<Integer> q = new LinkedList<>();
            q.add(i);

            while (!q.isEmpty()) {
                int u = q.removeFirst();
                if (visited[u])
                    continue;
                visited[u] = true;
                for (int v : adj[u]) {
                    if (!visited[v]) {
                        q.add(v);
                    }
                }
            }

            int sum = 0;
            for (int j = 1; j <= V; j++) {
                if (visited[j]) {
                    visited[j] = false;
                    sum++;
                }
            }
            System.out.println(i + " : " + sum);
            ret = Math.max(ret, sum);
        }

        System.out.println(ret);

    }

    // static int dfs(int u) {
    // System.out.println(u);

    // int sum = 0;
    // for(int v : adj[u]) {
    // if (!visited[v]) {
    // visited[v] = true;
    // sum += dfs(v);
    // }
    // }

    // return sum + 1;
    // }

}