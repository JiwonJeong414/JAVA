import java.util.*;
import java.io.*;

class subarray {
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("subarray.in"));
        PrintWriter out = new PrintWriter(new FileWriter("subarray.out"));
        int t = Integer.parseInt(f.readLine());
        int max1 = Integer.MIN_VALUE;
        for (int j = 0; j < t; j++) {
            int max = 0;
            int max_current = 0;
            int sum = 0;
            int n = Integer.parseInt(f.readLine());
            arr = new int[n];
            StringTokenizer st = new StringTokenizer(f.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                System.out.println(Arrays.toString(arr));
                if (arr[i] > max1) {
                    max1 = arr[i];
                }
            }
            if (max1 < 0) {
                out.println(max1 + " " + max1);
            } else {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > max_current + arr[i]) {
                        max_current = arr[i];
                    } else {
                        max_current = max_current + arr[i];
                        System.out.println(max_current);
                        max = Math.max(max, max_current);
                    }
                }
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > 0) {
                        sum += arr[i];
                    }
                }
                out.println(max + " " + sum);
            }
        }
        out.close();
    }
}