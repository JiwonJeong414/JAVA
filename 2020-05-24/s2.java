import java.util.*;

class s2 {

    static int count = 0;
    static String[] input = { "10000", "11010", "01000", "01110", "11011" };
    static int[][] ar = new int[input.length][input[0].length()];

    public static void main(String[] args) {
        printAr();
        maze(0, 0);

    }

    static void printAr() {
        System.out.println();
        for (int[] row : ar) {
            System.out.println(Arrays.toString(row));
        }
    }

    static void maze(int x, int y) {
        count++;
        if (x < 0 || x >= ar.length) {
            return;
        }
        if (y < 0 || y >= ar[x].length) {
            return;
        }
        if (input[x].charAt(y) == '0') {
            return;
        }

        ar[x][y] = 1;
        printAr();

        if (x == 4 && y == 4) {
            System.out.println("count: " + count);
        }

        maze(x + 1, y);
        maze(x, y + 1);

        ar[x][y] = 0;
    }
}