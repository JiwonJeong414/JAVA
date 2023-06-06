import java.util.*;
import java.io.*;

public class bfs {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("bfs.in"));

        int V = in.nextInt();
        int E = in.nextInt();
        int infinity = Integer.MAX_VALUE / 2;
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> adj[] = new ArrayList[V + 1];
        int dist[] = new int[V + 1];
        Arrays.fill(dist, -1);

        for (int i = 1; i <= V; i++) {
            adj[i] = new ArrayList<>();
        }

        System.out.println(Arrays.toString(adj));

        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            adj[a].add(b);
            adj[b].add(a);
        }

        System.out.println(Arrays.toString(adj));
        System.out.println(Arrays.toString(dist));

        dist[1] = 0;
        q.add(1);
        while (!q.isEmpty()) {
            int u = q.remove();
            for (int v : adj[u]) {
                if (dist[v] == -1) {
                    q.add(v);
                    dist[v] = 1 + dist[u];
                }
            }
        }

        System.out.println(Arrays.toString(dist));
    }
}
