import java.util.*;
import java.io.*;

public class dfsstack {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("graph.in"));

        int V = in.nextInt();
        int E = in.nextInt();
        Deque<Integer> stack = new LinkedList<>();
        ArrayList<Integer> adj[] = new ArrayList[V + 1];
        boolean[] visited = new boolean[V + 1];

        for (int i = 1; i <= V; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            adj[a].add(b);
            adj[b].add(a);
        }

        System.out.println(Arrays.toString(adj));

        visited[1] = true;
        stack.add(1);

        while (!stack.isEmpty()) {
            int u = stack.removeLast();// stack
            // int u = stack.removeFirst();// queue
            System.out.println(u);
            for (int v : adj[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    stack.add(v);
                }
            }
            System.out.println(Arrays.toString(visited));
        }
    }
}