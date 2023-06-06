import java.util.*;
import java.io.*;

class perimeter {
    static char ar[][];
    static char visited[][];
    static int finalArea = Integer.MIN_VALUE;
    static int finalPerimeter = Integer.MIN_VALUE;
    static int area;
    static int perimeter;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("perimeter.in"));
        PrintWriter out = new PrintWriter(new FileWriter("perimeter.out"));

        int N = in.nextInt();

        char[][] ar = new char[N][];
        char[][] visited = new char[N][];

        for (int i = 0; i < N; i++) {
            ar[i] = in.next().toCharArray();
            visited[i] = ar[i];
        }
        display(ar);
        display(visited);

        for (int row = 0; row < ar.length; row++) {
            for (int col = 0; col < ar[row].length; col++) {
                if (ar[row][col] != '.') {
                    System.out.println(ar[row][col]);
                    floodfill(row, col);
                    if (area > finalArea) {
                        finalArea = area;
                    }
                    if (perimeter > finalPerimeter) {
                        finalPerimeter = perimeter;
                    }
                    area = 0;
                    perimeter = 0;
                    display(ar);
                }
            }
        }
        out.print(finalArea);
        out.print(finalArea);
        out.close();
    }

    public static void floodfill(int row, int col) {
        // exit cases
        if (row < 0 || row >= ar.length) {
            return;
        }
        if (col < 0 || col >= ar[row].length) {
            return;
        }
        if (ar[row][col] == '.') {
            return;
        }

        area++;
        for (int i = 0; i < 4; i++) {
            if (visited[row + 1][col] == '.' || row < 0 || row >= ar.length)
                perimeter++;
            if (visited[row - 1][col] == '.' || row < 0 || row >= ar.length)
                perimeter++;
            if (visited[row][col + 1] == '.' || col < 0 || col >= ar[row].length)
                perimeter++;
            if (visited[row][col - 1] == '.' || col < 0 || col >= ar[row].length)
                perimeter++;
        }
        ar[row][col] = '.';

        // recursive call
        floodfill(row, col + 1);
        floodfill(row, col - 1);
        floodfill(row + 1, col);
        floodfill(row - 1, col);
    }

    public static void display(char[][] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(Arrays.toString(ar[i]));
        }
    }
}
