import java.util.*;
import java.io.*;

class s1 {
    static int V;
    static int E;
    static ArrayList<Integer>[] adj;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("s1.in"));
        StringTokenizer st = new StringTokenizer(in.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        adj = new ArrayList[V];
        for (int i = 0; i < V; i++)
            adj[i] = new ArrayList<>();
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(in.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        System.out.println(Arrays.toString(adj));
        // --------------------------------------------------------------

        visited = new boolean[V];
        visited[0] = true;
        System.out.println(canReach(0, 6)); // false
        visited = new boolean[V];
        visited[5] = true;
        System.out.println(canReach(5, 3)); // true

        visited = new boolean[V];
        visited[0] = true;
        System.out.println(getSize(0));
        visited = new boolean[V];
        visited[7] = true;
        System.out.println(getSize(7));
    }

    static boolean canReach(int u, int dest) {
        if (u == dest) {
            return true;
        }
        for (int v : adj[u]) {
            if (!visited[v]) {
                visited[v] = true;
                if (canReach(v, dest)) {
                    return true;
                }
            }
        }
        return false;
    }

    static int getSize(int u) {
        int size = 1;
        for (int v : adj[u]) {
            if (!visited[v]) {
                visited[v] = true;
                size += getSize(v);
            }
        }
        return size;
    }
}