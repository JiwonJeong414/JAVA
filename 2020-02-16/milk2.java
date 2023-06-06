
/*
ID: jiwonje2
LANG: JAVA
TASK: milk2
*/
import java.util.*;
import java.io.*;

class milk2 {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("milk2.in"));
        PrintWriter out = new PrintWriter(new FileWriter("milk2.out"));

        int N = Integer.parseInt(f.readLine());

        int[] ar = new int[N];
        int[] ar2 = new int[N];

        int max = 0;
        int max2 = 0;
        int save = 0;
        int cnt = 0;
        int currentstart = 0;
        int currentend = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            ar[i] = Integer.parseInt(st.nextToken());
            ar2[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ar);
        Arrays.sort(ar2);

        for (int i = 0; i < N; i++) {
            if (ar2[i] - ar[i] > max) {
                max = ar2[i] - ar[i];
            }
            if (i != 0 && ar[i] > ar2[i - 1]) {
                if (ar[i] - ar2[i - 1] > max2) {
                    max2 = ar[i] - ar2[i - 1];
                }
                save = 1;
            }
            if (i != 0 && ar[i] <= ar2[i - 1]) {
                if (save == 1) {
                    save = 0;
                    cnt = 0;
                }
                cnt++;
                currentend = i;
                currentstart = i - cnt;
            }
            if (ar2[currentend] - ar[currentstart] > max) {
                max = ar2[currentend] - ar[currentstart];
                System.out.println("max:" + (ar2[currentend] - ar[currentstart]));
            }
        }
        out.print(max);
        out.println(" " + max2);

        out.close();
    }
}