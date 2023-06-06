import java.util.*;
import java.io.*;

class s3 {
    static int V;
    static int E;
    static ArrayList<Integer>[] adj;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("s3.in"));
        // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        if (V - 1 != E) {
            System.out.println("NO");
            return;
        }
        adj = new ArrayList[V + 1];
        for (int i = 0; i <= V; i++)
            adj[i] = new ArrayList<>();
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(in.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
        }
        System.out.println(Arrays.toString(adj));

        // --------------------------------------------------------------
        int max = 0;
        for (int i = 1; i <= V; i++) {
            visited = new boolean[V + 1];
            visited[i] = true;
            int a = getSize(i);
            if (a > max) {
                max = a;
            }
        }
        System.out.println(max);

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