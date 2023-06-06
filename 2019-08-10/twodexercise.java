import java.util.*;

class twodexercise {
    public static void main(String[] args) {
        int[][] ar = { { 7, 3, 9 }, { 1, 9, 2, 4 }, { 6, 8 } };

        System.out.println(findMax(ar));
        System.out.println(findMaxEven(ar));
        System.out.println(findAverageEven(ar));
        System.out.println(countN(ar, 9));
        System.out.println(Arrays.toString(biggestSubArray(ar)));
    }

    public static int findMax(int[][] ar) {
        // implement
        int max = 0;
        for (int r = 0; r < ar.length; r++) {
            for (int c = 0; c < ar[r].length; c++) {
                if (ar[r][c] > max) {
                    max = ar[r][c];
                }
            }
        }
        return max;
    }

    public static int findMaxEven(int[][] ar) {
        int maxeven = 0;
        for (int r = 0; r < ar.length; r++) {
            for (int c = 0; c < ar[r].length; c++) {
                if (ar[r][c] % 2 == 0 && ar[r][c] > maxeven) {
                    maxeven = ar[r][c];
                }
            }
        }
        return maxeven;
    }

    public static double findAverageEven(int[][] ar) {
        double count = 0;
        double count2 = 0;
        double averageeven = 0;
        for (int r = 0; r < ar.length; r++) {
            for (int c = 0; c < ar[r].length; c++) {
                if (ar[r][c] % 2 == 0) {
                    count = count + ar[r][c];
                    count2++;
                }
            }
        }
        averageeven = count / count2;
        return averageeven;
    }

    public static int countN(int[][] ar, int n) {
        int count = 0;
        for (int r = 0; r < ar.length; r++) {
            for (int c = 0; c < ar[r].length; c++) {
                if (ar[r][c] == n) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int[] biggestSubArray(int[][] ar) {
        int biggestrow = 0;
        int maxsum = 0;
        for (int r = 0; r < ar.length; r++) {
            int sum = 0;
            for (int c = 0; c < ar[r].length; c++) {
                sum += ar[r][c];
            }
            if (sum > maxsum) {
                maxsum = sum;
                biggestrow = r;
            }
        }
        return ar[biggestrow];
    }
}