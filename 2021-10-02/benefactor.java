import java.util.*;
import java.io.*;

class main {

    public static void main2(String[] args) {
        for (int i = 0; i < args.length; i++) {
            dijk(i); 
            max
            for(int v : dist)
                max = max
        }
    }

    public static void main(String[] args) throws Exception {
        // Scanner in = new Scanner(new File("benefactor.in"));
        Scanner in = new Scanner(System.in);

        int Q = in.nextInt();
        int V;
        int E;
        int max;
        ArrayList<int[]> adj[];
        int[] dist;

        PriorityQueue<int[]> pq;
        for (int m = 0; m < Q; m++) {
            max = 0;
            V = in.nextInt();
            E = V - 1;
            pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
            adj = new ArrayList[V + 1];
            dist = new int[V + 1];

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

            for (int i = 1; i <= 6; i++) {
                Arrays.fill(dist, Integer.MAX_VALUE / 2);

                dist[i] = 0;
                pq.add(new int[] { i, 0 });

                while (!pq.isEmpty()) {
                    int[] cur = pq.remove();
                    int u = cur[0];
                    int w = cur[1];

                    if (dist[u] < w)
                        continue;

                    for (int[] next : adj[u]) {
                        int v = next[0];
                        int w2 = next[1] + w;
                        if (dist[v] > w2) {
                            dist[v] = w2;
                            pq.add(new int[] { v, w2 });
                        }
                    }
                }

                for (int j = 0; j < dist.length; j++) {
                    if (dist[j] != 1073741823 && dist[j] > max) {
                        max = dist[j];
                    }
                }
            }
            System.out.println(max);
        }
    }
}