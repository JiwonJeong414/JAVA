import java.util.*;
import java.io.*;

public class pathdestination {
    static ArrayList<Integer> adj[];
    static Stack<Integer> stack = new Stack<>();
    static int V, E;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("dfs1.in"));

        // initialize
        V = in.nextInt();
        E = V - 1;
        adj = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++)
            adj[i] = new ArrayList<>();

        // popularize
        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            adj[a].add(b);
        }

        System.out.println(Arrays.toString(adj));

        stack.add(1);
        solve(1, 9);

    }

    static void solve(int u, int dest) {
        System.out.println(u);
        if (u == 9) {
            System.out.println(stack);
        }
        for (int v : adj[u]) {
            stack.add(v);
            solve(v, dest);
            stack.pop();
        }
    }
}
