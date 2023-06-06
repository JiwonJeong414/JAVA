import java.util.*;
import java.io.*;

class fenceplan {
    static ArrayList<Integer> adj[];
    static ArrayList<Integer> adjtwo[];
    static int V, E;
    static int[] groups;
    static int groupnum = 1;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("fenceplan.in"));
        PrintWriter out = new PrintWriter(new FileWriter("fenceplan.out"));

        V = in.nextInt();
        E = in.nextInt();
        V = in.nextInt();

        groups = new int[V + 1];
        visited = new boolean[V + 1];
        int x[] = new int[V + 1];
        int y[] = new int[V + 1];

        for (int i = 1; i <= V; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }

        adj = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++)
            adj[i] = new ArrayList<>();

        for (int i = 1; i <= E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            adj[a].add(b);
            adj[b].add(a);
        }

        System.out.println(Arrays.toString(adj));
        for (int i = 1; i <= V; i++) {
            if (groups[i] == 0) {
                groups[i] = groupnum;
                dfs(i);
                groupnum++;
            }
        }
        int minx = Integer.MAX_VALUE;
        int maxx = Integer.MIN_VALUE;
        int miny = Integer.MAX_VALUE;
        int maxy = Integer.MIN_VALUE;
        int answer = Integer.MAX_VALUE;

        adjtwo = new ArrayList[groupnum];

        for (int i = 1; i < groupnum; i++)
            adjtwo[i] = new ArrayList<>();

        for (int i = 1; i < groups.length; i++)
            adjtwo[groups[i]].add(i);

        for (int i = 1; i < groupnum; i++) {
            for (int j = 0; j < adjtwo[i].size(); j++) {
                if (x[adjtwo[i].get(j)] < minx)
                    minx = x[adjtwo[i].get(j)];
                if (x[adjtwo[i].get(j)] > maxx)
                    maxx = x[adjtwo[i].get(j)];
                if (y[adjtwo[i].get(j)] < miny)
                    miny = y[adjtwo[i].get(j)];
                if (y[adjtwo[i].get(j)] > maxy)
                    maxy = y[adjtwo[i].get(j)];
            }
            if ((maxx - minx) * 2 + (maxy - miny) * 2 < answer) {
                answer = (maxx - minx) * 2 + (maxy - miny) * 2;
            }
            minx = Integer.MAX_VALUE;
            maxx = Integer.MIN_VALUE;
            miny = Integer.MAX_VALUE;
            maxy = Integer.MIN_VALUE;
        }
        out.println(answer);
        out.close();
    }

    static void dfs(int u) {
        if (visited[u] == true) {
            return;
        }
        visited[u] = true;
        for (int v : adj[u]) {
            groups[v] = groupnum;
            dfs(v);
        }
    }
}
