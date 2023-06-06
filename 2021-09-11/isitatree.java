import java.util.*;
import java.io.*;

public class isitatree {
    static int V, E;
    static ArrayList<Integer> adj[];
    static boolean visited[];

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("isitatree.in"));

        V = in.nextInt();
        E = in.nextInt();

        if (E != V - 1) {
            System.out.println("NO");
        } else {
            adj = new ArrayList[V + 1];
            for (int i = 1; i <= V; i++)
                adj[i] = new ArrayList<>();
            visited = new boolean[V + 1];

            for (int i = 0; i < E; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                adj[a].add(b);
            }

            if (dfs(1) == V) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static int dfs(int u) {

        System.out.println(u);

        if (visited[u] == true) {
            return 0;
        }
        visited[u] = true;
        int cnt = 1;
        for (int v : adj[u]) {
            cnt += dfs(v);
        }

        return cnt;
    }
}
