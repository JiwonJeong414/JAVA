import java.util.*;
import java.io.*;

class mootube {
    static class Node {
        int v;
        int r;

        public Node(int v, int r) {
            this.v = v;
            this.r = r;
        }

        public String toString() {
            return v + " " + r;
        }
    }

    static ArrayList<Node> adj[];
    static int V, E;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("mootube.in"));
        PrintWriter out = new PrintWriter(new FileWriter("mootube.out"));

        V = in.nextInt();
        E = V - 1;
        int Q = in.nextInt();

        visited = new boolean[V + 1];

        adj = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++)
            adj[i] = new ArrayList<>();

        for (int i = 1; i <= E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int m = in.nextInt();
            adj[a].add(new Node(b, m));
            adj[b].add(new Node(a, m));
        }

        System.out.println(Arrays.toString(adj));

        for (int i = 0; i < Q; i++) {
            int K = in.nextInt();
            int start = in.nextInt();
            System.out.println(dfs(start, K));
        }
    }

    static int dfs(int u, int K) {
        int sum = 0;
        for (int v : adj[u])
            sum += dfs(v);
        return 1 + sum;
    }
}
