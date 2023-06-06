import java.util.*;
import java.io.*;

class s1 {
    static int count = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("s1.in"));
        PrintWriter out = new PrintWriter(new FileWriter("s1.out"));
        int t = Integer.parseInt(f.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int startx = 0;
            int starty = 0;
            int endx = 0;
            int endy = 0;
            char[][] d = new char[n][m];
            int[][] ar = new int[n][m];
            for (int j = 0; j < n; j++) {
                // for every row, you can use .toCharArray() to put it into the row of the 2d
                // char array
                d[j] = f.readLine().toCharArray();
                System.out.println(Arrays.toString(d[j]));
                int a = location(n, m, d);
                int b = location1(n, m, d);
                int c = location2(n, m, d);
                int e = location3(n, m, d);
                startx = a;
                starty = b;
                endx = c;
                endy = e;
            }
            System.out.println(startx);
            System.out.println(starty);
            System.out.println(endx);
            System.out.println(endy);
            maze(startx, starty, endx, endy, d, ar);
            printAr(d);
            int k = Integer.parseInt(f.readLine());
        }
    }

    static int location(int n, int m, char[][] d) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (d[i][j] == 'M') {
                    return i;
                }
            }
        }
        return 0;
    }

    static int location1(int n, int m, char[][] d) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (d[i][j] == 'M') {
                    return j;
                }
            }
        }
        return 0;
    }

    static int location2(int n, int m, char[][] d) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (d[i][j] == '*') {
                    return i;
                }
            }
        }
        return 0;
    }

    static int location3(int n, int m, char[][] d) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (d[i][j] == '*') {
                    return j;
                }
            }
        }
        return 0;
    }

    static void printAr(char[][] d) {
        System.out.println();
        for (char[] row : d) {
            System.out.println(Arrays.toString(row));
        }
    }

    static void maze(int x, int y, int endx, int endy, char[][] d, int[][] ar) {
        count++;
        if (x < 0 || x >= ar.length) {
            return;
        }
        if (y < 0 || y >= ar[x].length) {
            return;
        }
        if (d[x][y] == 'X') {
            return;
        }
        if (d[x][y] == '0') {
            return;
        }

        d[x][y] = '0';

        if (x == endx && y == endy) {
            System.out.println("count: " + count);
        }

        maze(x + 1, y, endx, endy, d, ar);
        maze(x, y + 1, endx, endy, d, ar);
        d[x][y] = '.';
        count--;

        maze(x - 1, y, endx, endy, d, ar);
        maze(x, y - 1, endx, endy, d, ar);

        d[x][y] = '.';
        count--;

    }
}