import java.util.*;
import java.io.*;

public class s1 {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("s1.in"));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        LinkedList<Edge>[] adj = new LinkedList[V + 1];
        for (int i = 1; i <= V; i++)
            adj[i] = new LinkedList<>();
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(in.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            adj[u].add(new Edge(v, w));
            adj[v].add(new Edge(u, w));
        }

        System.out.println(Arrays.toString(adj));

        // dijkstra
        PriorityQueue<State> pq = new PriorityQueue<>((a, b) -> a.w - b.w);
        int[] dist = new int[V + 1]; // { 0, 0, 0, 0 ... }
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;

        pq.add(new State(1, 0));
        while (!pq.isEmpty()) {
            State nextState = pq.remove();
            int u = nextState.v;
            int w = nextState.w;

            for (Edge e : adj[u]) {
                if (e.w + w < dist[e.v]) {
                    dist[e.v] = e.w + w;
                    pq.add(new State(e.v, e.w + w));
                }
            }

            System.out.println(pq);
        }

        System.out.println(Arrays.toString(dist));
    }
}

class Edge {
    int v, w;

    public Edge(int v, int w) {
        this.v = v;
        this.w = w;
    }

    public String toString() {
        return "(" + v + "," + w + ")";
    }
}

class State {
    int v, w;

    public State(int v, int w) {
        this.v = v;
        this.w = w;
    }

    public String toString() {
        return "(" + v + "," + w + ")";
    }
}