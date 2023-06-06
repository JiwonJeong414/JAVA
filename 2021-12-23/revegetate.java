import java.util.*;
import java.io.*;

class revegetate {
    static class Node {
        int v;
        String type;

        public Node(int v, String type) {
            this.v = v;
            this.type = type;
        }
    }

    static ArrayList<Node> adj[];
    static int V, E;
    static char type[];
    static int groups[];
    static int zero[];
    static int groupnum = 1;
    static boolean[] visited;

    static int[][] input = new int[E][3]; // 1 1 2 : S 1 2

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("revegetate.in"));
        PrintWriter out = new PrintWriter(new FileWriter("revegetate.out"));

        V = in.nextInt();
        E = in.nextInt();

        groups = new int[V + 1];
        zero = new int[V + 1];
        visited = new boolean[V + 1];

        adj = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++)
            adj[i] = new ArrayList<>();

        for (int i = 1; i <= E; i++) {
            String m = in.next();
            int a = in.nextInt();
            int b = in.nextInt();
            adj[a].add(new Node(b, m));
            adj[b].add(new Node(a, m));
        }

        for (int i = 1; i <= V; i++) {
            if (groups[i] == 0) {
                groups[i] = 1;
                dfs(i);
                groupnum++;
            }
        }
        groupnum = groupnum - 1;
        out.print(1);
        for (int i = 0; i < groupnum; i++) {
            out.print(0);
        }
        out.close();
    }

    static void dfs(int u) {
        if (visited[u] == true)
            return;
        visited[u] = true;
        for (Node next : adj[u]) {
            int v = next.v;
            String type = next.type;

            if (S)
                groups[v] = groups[u];
            else
                groups[v] = groups[u] == 1 ? 2 : 1;

            dfs(v);
        }
    }
}
