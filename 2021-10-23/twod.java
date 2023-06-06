import java.util.*;
import java.io.*;

class twod {

    public static void main(String[] args) throws Exception {
        int[][] ar = new int[5][6];

        int cnt = 10;

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                cnt++;
                ar[i][j] = cnt;
            }
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.println(Arrays.toString(ar[i]));
        }

        System.out.println(ar[3][1]);
    }
}
