import java.util.*;
import java.io.*;

class knight {
    static int cnt = 0;
    static int[][] ar = new int[8][8];

    public static void main(String[] args) {
        printAr();
        knight(0, 0);
        printAr();
    }

    static void printAr() {
        System.out.println();
        for (int[] row : ar) {
            System.out.println(Arrays.toString(row));
        }
    }

    static void knight(int x, int y) {

        if (x < 0 || x >= ar.length) {
            return;
        }
        if (y < 0 || y >= ar[x].length) {
            return;
        }
        if (ar[x][y] == 1) {
            return;
        }
        cnt++;
        ar[x][y] = 1;

        knight(x + 1, y + 2);
        knight(x - 1, y + 2);
        knight(x - 2, y + 1);
        knight(x - 2, y - 1);

        knight(x - 1, y - 2);
        knight(x + 1, y - 2);
        knight(x + 2, y - 1);
        knight(x + 2, y + 1);

        ar[x][y] = 0;
    }
}