import java.util.*;
import java.io.*;

class stone {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("stone.in"));
        int q = sc.nextInt();
        int cnt = 1;
        int cnt1 = 0;
        for (int j = 0; j < q; j++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            Integer[] ar = new Integer[m];
            for (int i = 0; i < ar.length; i++) {
                ar[i] = sc.nextInt();
            }
            Arrays.sort(ar, (a, b) -> b - a);
            System.out.println(Arrays.toString(ar));
            for (int i = 0; i < ar.length; i++) {
                if (n % ar[i] == 0) {
                    for (int k = 0; k < cnt; k++) {
                        System.out.println(ar[i]);
                        cnt1++;
                    }
                    cnt = n / ar[i];
                    n = ar[i];
                }
            }
        }
        System.out.println("answer: " + cnt1);
    }
}