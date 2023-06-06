import java.util.*;

class blah {
    public static void main(String[] args) {
        int[][] ar = { { 6, 7, 8 }, { 1, 1, 2, 3 }, { 8, 8 } };

        System.out.println(getMax(ar));
        System.out.println(getAverageOfEven(ar));

        int[] ans = biggestSubArray(ar);
        System.out.println(Arrays.toString(ans));

        int[] anss = biggestSubArray2(ar);
        System.out.println(Arrays.toString(anss));

        int[] ansss = longestSubArray(ar);
        System.out.println(Arrays.toString(ansss));
    }

    static int getMax(int[][] ar) {
        int max = 0;
        for (int r = 0; r < ar.length; r++) {
            for (int c = 0; c < ar[r].length; c++) {
                if (ar[r][c] > max)
                    max = ar[r][c];
            }
        }

        return max;
    }

    static double getAverageOfEven(int[][] ar) {
        int p = 0;
        int count = 0;
        for (int r = 0; r < ar.length; r++) {
            for (int c = 0; c < ar[r].length; c++) {
                if (ar[r][c] % 2 == 0) {
                    p += ar[r][c];
                    count++;
                }
            }
        }
        return p / count;
    }

    static int[] biggestSubArray(int[][] ar) {
        int max = 0;
        int maxr = 0;
        for (int r = 0; r < ar.length; r++) {
            int sum = 0;
            for (int c = 0; c < ar[r].length; c++) {
                sum += ar[r][c];
                if (sum > max) {
                    max = sum;
                    maxr = r;
                }
            }
        }
        return ar[maxr];
    }

    static int[] biggestSubArray2(int[][] ar) {
        double avg = 0.0;
        int avgr = 0;
        for (int r = 0; r < ar.length; r++) {
            int sum = 0;
            int count = 0;
            for (int c = 0; c < ar[r].length; c++) {
                sum += ar[r][c];
                count++;
                if ((sum / count) > avg) {
                    avg = sum / count;
                    avgr = r;
                }
            }
        }
        return ar[avgr];
    }

    static int[] longestSubArray(int[][] ar) {
        int max = 0;
        int maxr = 0;
        for (int r = 0; r < ar.length; r++) {
            if (ar[r].length > max) {
                max = ar[r].length;
                maxr = r;
            }
        }
        return ar[maxr];
    }
}