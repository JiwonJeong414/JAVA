import java.util.*;
import java.io.*;

class homework {
    static int[] ar;

    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("homework.in"));
        PrintWriter out = new PrintWriter(new FileWriter("homework.out"));
        int n = Integer.parseInt(f.readLine());
        ar = new int[n];
        StringTokenizer st = new StringTokenizer(f.readLine());
        for (int i = n - 1; i >= 0; i--) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(ar));
        int k = n - 2;
        int a = 2;
        double average = 0;
        int min = 0;
        int sum = 0;
        double maxAvg = 0;
        int cnt = -1;
        int minSet = Integer.MAX_VALUE;
        for (int j = 0; j < ar.length - 1; j++) {
            for (int i = 0; i < a; i++) {
                if (ar[i] < minSet) {
                    minSet = ar[i];
                    min = ar[i];
                }
                cnt++;
                sum += ar[i];
            }
            sum = sum - min;
            average = (double) sum / cnt;
            System.out.println("sum: " + sum);
            System.out.println("min: " + min);
            System.out.println("average: " + average);
            if (average > maxAvg) {
                maxAvg = average;
            }
            k--;
            a++;
            average = 0;
            sum = 0;
            cnt = -1;
            maxAvg = 0;
        }
    }
}