import java.util.*;
import java.io.*;

public class s1 {

    static String[] maze;
    static int[][] path;
    static PrintWriter out;

    public static void main(String[] args) throws IOException {

        // WARMUP

        // FIND PATH FROM B -> E and print the PATH
        BufferedReader f = new BufferedReader(new FileReader("input.in"));
        out = new PrintWriter(new FileWriter("input.out"));

        String[] line = f.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);

        maze = new String[N];
        path = new int[N][M];

        for (int i = 0; i < N; i++) {
            maze[i] = f.readLine();
        }

        solve(0, 0);
        out.close();
    }

    static void solve(int r, int c) {
        if (r < 0 || c < 0 || r >= maze.length || c >= maze[0].length())
            return;
        if (maze[r].charAt(c) == '0' || path[r][c] == 1)
            return;

        path[r][c] = 1;

        if (maze[r].charAt(c) == 'E') {
            for (int[] row : path) {
                for (int val : row) {
                    out.print(val);
                }
                out.println();
            }
            return;
        }

        // what choices do I have
        solve(r + 1, c);
        solve(r - 1, c);
        solve(r, c + 1);
        solve(r, c - 1);

        path[r][c] = 0;
    }
}