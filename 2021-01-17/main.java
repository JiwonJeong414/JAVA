import java.util.*;
import java.io.*;

class main {
    static int INF = Integer.MAX_VALUE / 2;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("in"));

        int V = in.nextInt();
        int E = in.nextInt();
        Deque<Node>[] adj = new LinkedList[V + 1]; // linkedlist is also fine
        int dist[] = new int[V + 1];

        Arrays.fill(dist, INF);
        for (int i = 1; i <= V; i++)
            adj[i] = new LinkedList<>();
        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int w = in.nextInt();
            adj[a].add(new Node(b, w));
            adj[b].add(new Node(a, w));
        }

        // ----------------------
        PriorityQueue<Node> q = new PriorityQueue<>((a, b) -> a.w - b.w);
        q.add(new Node(1, 0));
        dist[1] = 0;

        int[] par = new int[V + 1];
        while (!q.isEmpty()) {
            Node cur = q.remove();
            if (cur.w > dist[cur.v])
                continue;

            for (Node next : adj[cur.v]) {
                int w = next.w + dist[cur.v];
                if (w < dist[next.v]) {
                    dist[next.v] = w;
                    par[next.v] = cur.v;
                    q.add(new Node(next.v, w));
                }
            }
        }
        Deque<Integer> dq = new LinkedList<>();
        int i = 5;
        dq.addFirst(i);
        while (i != 1) {
            i = par[i];
            dq.addFirst(i);
        }
        for (int v : dq) {
            System.out.print(v + " ");
        }
    }

    static class Node {
        int v, w;

        public Node(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }
}