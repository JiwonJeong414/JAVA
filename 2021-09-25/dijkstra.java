import java.util.*;
import java.io.*;

class dijkstra {
    static int Inf = Integer.MAX_VALUE / 2;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("graph.in"));

        // graph
        int V = in.nextInt();
        int E = in.nextInt();
        LinkedList<Pair> adj[] = new LinkedList[V + 1];
        for (int i = 1; i <= V; i++) {
            adj[i] = new LinkedList<>();
        }
        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int w = in.nextInt();
            adj[a].add(new Pair(b, w));
            adj[b].add(new Pair(a, w));
        }

        System.out.println(Arrays.toString(adj));

        // Dijkstra
        PriorityQueue<Pair> q = new PriorityQueue<>((a, b) -> a.w - b.w);
        int dist[] = new int[V + 1]; // 0,0,0,0,0,0
        Arrays.fill(dist, Inf);

        q.add(new Pair(1, 0));
        dist[1] = 0;

        while (!q.isEmpty()) {
            Pair p = q.remove();
            int u = p.v;

            for (Pair pp : adj[u]) {
                int v = pp.v;
                int w = pp.w;
                if (dist[v] < w + dist[u]) {
                    q.add(new Pair(v, w + dist[u]));
                    dist[v] = dist[u] + 1;
                }
            }
        }

        System.out.println(Arrays.toString(dist));

    }
}

class Pair {
    int v, w;

    public Pair(int v, int w) {
        this.v = v;
        this.w = w;
    }

    public String toString() {
        return "(" + v + ", " + w + ")";
    }
}
