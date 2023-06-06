import java.util.*;
import java.io.*;

public class bfs {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("graph.in"));

        int V = in.nextInt();
        int E = in.nextInt();
        Deque<Integer> dq = new LinkedList<>();
        ArrayList<Integer> adj[] = new ArrayList[V + 1];
        int[] dist = new int[V + 1];
        Arrays.fill(dist, -1);

        for (int i = 1; i <= V; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            adj[a].add(b);
            adj[b].add(a);
        }

        System.out.println(Arrays.toString(adj));

        dist[1] = 0;
        dq.add(1);

        while (!dq.isEmpty()) {
            int u = dq.removeFirst(); // queue
            System.out.println(u);
            for (int v : adj[u]) {
                if (dist[v] == -1) {
                    dist[v] = dist[u] + 1;
                    dq.add(v);
                }
            }
            System.out.println(Arrays.toString(dist));
        }
    }
}