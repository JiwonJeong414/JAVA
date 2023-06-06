import java.util.*;
import java.io.*;

public class benefactor {
    static int V, E;
    static ArrayList<Integer> adj[];
    static int q;
    static int w;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("benefactor.in"));

        q = in.nextInt();
        V = in.nextInt();
        E = V - 1;
        adj = new ArrayList[V + 1];

        for (int i = 1; i <= V; i++)
            adj[i] = new ArrayList<>();

        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

        }
    }
}
