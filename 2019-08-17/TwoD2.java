import java.util.*;

class TwoD2 {
    public static void main(String[] args) {
        int[][] ar = { { 3, 3, 3 }, { 4, 4, 4, 4 }, { 2, 2 }, };

        System.out.println(Arrays.toString(subSums(ar)));

        int[][] ar2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, };

        display2d(ar2);
        System.out.println();
        display2d(rotate(ar2));
    }

    public static int[][] rotate(int[][] ar) {
        int[][] rotated = new int[ar.length][ar.length];
        for (int r = 0; r < ar.length; r++) {
            for (int c = 0; c < ar[r].length; c++) {
                rotated[c][ar.length - (1 + r)] = ar[r][c];
            }
        }
        return rotated;
    }

    public static void display2d(int[][] ar) {
        // display a 2d array
        for (int r = 0; r < ar.length; r++) {
            for (int c = 0; c < ar[r].length; c++) {
                System.out.print(ar[r][c] + " ");
            }
            System.out.println();
        }
    }

    // taking in a 2d Array, we will calculate the sums
    // of each row, and return an array containing the sums
    // of each row
    public static int[] subSums(int[][] ar) {
        int[] ar2 = new int[ar.length];
        for (int r = 0; r < ar.length; r++) {
            int sum = 0;
            for (int c = 0; c < ar[r].length; c++) {
                sum += ar[r][c];
            }
            ar2[r] = sum;
        }
        return ar2;
    }
}