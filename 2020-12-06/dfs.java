import java.util.*;
import java.io.*;

class dfs {
    static LinkedList<Integer>[] adj;
    static boolean[] visited;
    static int V;
    static int E;

    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("dfs.in"));
        PrintWriter out = new PrintWriter(new FileWriter("dfs.out"));
        StringTokenizer st = new StringTokenizer(f.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        LinkedList<Node>[] adj = new LinkedList[V + 1];
        for (int i = 1; i <= V; i++)
            adj[i] = new LinkedList<>();
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(f.readLine());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            adj[v].add(new Node(b, w));
            adj[w].add(new Node(a, w));
        }

        System.out.println(Arrays.toString(adj));

        PriorityQueue<Node> q = new PriorityQueue<>((a, b) -> a.w - b.w);
        int[] dist = new int[V + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;
        q.add(new Node(1, 0));

        while (!q.isEmpty()) {
            Node u = q.remove();
            for (Node edge : adj[u.v]) {
                int ww = dist[u.v] + edge.w;

                if (dist[edge.v] > ww) {
                    dist[edge.v] = ww;
                    q.add(new Node(edge.v, ww));
                }
            }
        }

    }

    static class Node {
        int v, w;

        public Node(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }

    public static void main2(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("dfs.in"));
        PrintWriter out = new PrintWriter(new FileWriter("dfs.out"));
        StringTokenizer st = new StringTokenizer(f.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        adj = new LinkedList[V + 1];
        visited = new boolean[V + 1];
        for (int i = 1; i <= V; i++)
            adj[i] = new LinkedList<>();
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(f.readLine());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            adj[v].add(w);
            adj[w].add(v);
        }

        System.out.println(Arrays.toString(adj));
        visited = new boolean[V + 1];
        dfs(1);
        visited = new boolean[V + 1];
        System.out.println("size: " + dfs_size(1));
        visited = new boolean[V + 1];
        System.out.println("depth: " + dfs_depth(1));
    }

    static void dfs(int u) {
        System.out.println(u);
        visited[u] = true;
        for (int v : adj[u]) {
            if (!visited[v])
                dfs(v);
        }
    }

    static int dfs_size(int u) {
        visited[u] = true;

        int cnt = 0;
        for (int v : adj[u]) {
            if (!visited[v])
                cnt += dfs_size(v);
        }
        return cnt + 1;
    }

    static int dfs_depth(int u) {
        visited[u] = true;

        int max = 0;
        for (int v : adj[u]) {
            if (!visited[v])
                max = Math.max(max, dfs_depth(v));
        }
        return max + 1;
    }
}
