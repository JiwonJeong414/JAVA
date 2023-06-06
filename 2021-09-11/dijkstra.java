import java.util.*;
import java.io.*;

public class dijkstra {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("graph2.in"));

        int V = in.nextInt();
        int E = in.nextInt();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        ArrayList<int[]> adj[] = new ArrayList[V + 1];
        int[] dist = new int[V + 1];
        Arrays.fill(dist, Integer.MAX_VALUE / 2);

        for (int i = 1; i <= V; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int w = in.nextInt();

            adj[a].add(new int[] { b, w });
            adj[b].add(new int[] { a, w });

        }

        dist[1] = 0;
        pq.add(new int[] { 1, 0 });

        while (!pq.isEmpty()) {
            int[] cur = pq.remove();
            int u = cur[0];
            int w = cur[1];

            if (dist[u] < w)
                continue;

            System.out.println(u);
            for (int[] next : adj[u]) {
                int v = next[0];
                int w2 = next[1] + w;
                if (dist[v] > w2) {
                    dist[v] = w2;
                    pq.add(new int[] { v, w2 });
                }
            }
        }

        System.out.println(Arrays.toString(dist));
    }
}
