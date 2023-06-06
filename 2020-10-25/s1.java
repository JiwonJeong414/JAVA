import java.util.*;
import java.io.*;

class s1 {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("s1.in"));
        // BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(f.readLine());
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
    }
}
