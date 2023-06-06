import java.util.*;
import java.io.*;

class milkvisits {
    static ArrayList<Integer> adj[];
    static int V, E, M;
    static int group[];
    static char milk[];

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("milkvisits.in"));
        PrintWriter out = new PrintWriter(new FileWriter("milkvisits.out"));

        V = in.nextInt();
        E = V - 1;
        M = in.nextInt();

        group = new int[V + 1];
        milk = in.next().toCharArray();

        adj = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++)
            adj[i] = new ArrayList<>();

        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            adj[a].add(b);
            adj[b].add(a);
        }

        for (int i = 1; i <= V; i++) {
            if (group[i] == 0) {
                dfs(i, i);
            }
        }

        for (int i = 0; i < M; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            char milks = in.next().charAt(0);
            if (group[start] != group[end]) {
                out.print(1);
            } else if (milks == milk[start - 1]) {
                out.print(1);
            } else {
                out.print(0);
            }
        }
        System.out.println(Arrays.toString(group));
        out.close();
    }

    static void dfs(int u, int current) {

        if (group[u] != 0) {
            return;
        }
        group[u] = current;
        for (int v : adj[u]) {
            if (milk[v - 1] == milk[u - 1]) {
                dfs(v, current);
            }
        }
    }
}
