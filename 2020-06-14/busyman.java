import java.util.*;
import java.io.*;

class busyman {
    static int[] start;
    static int[] end;

    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("busyman.in"));
        PrintWriter out = new PrintWriter(new FileWriter("busyman.out"));

        int t = Integer.parseInt(f.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(f.readLine());
            start = new int[n];
            end = new int[n];
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(f.readLine());
                start[j] = Integer.parseInt(st.nextToken());
                end[j] = Integer.parseInt(st.nextToken());
            }
            sort(start, end);
            int answer = activities(start, end);
            System.out.println(answer);
            sort1(start, end);
            int answer1 = activities1(start, end);
            System.out.println(answer1);
            if (answer1 > answer) {
                out.println(answer1);
            } else {
                out.println(answer);
            }
        }
        out.close();
    }

    static void sort(int[] start, int[] end) {
        for (int s = 0; s < start.length; s++) {
            for (int k = 0; k < start.length - 1; k++) {
                if (start[k] > start[k + 1]) {
                    int temp = 0;
                    temp = start[k];
                    start[k] = start[k + 1];
                    start[k + 1] = temp;
                    int temp1 = 0;
                    temp1 = end[k];
                    end[k] = end[k + 1];
                    end[k + 1] = temp1;
                }
                if (start[k] == start[k + 1]) {
                    if ((start[k + 1] - end[k + 1]) > (start[k] - end[k])) {
                        int temp2 = 0;
                        temp2 = start[k];
                        start[k] = start[k + 1];
                        start[k + 1] = temp2;
                        int temp3 = 0;
                        temp3 = end[k];
                        end[k] = end[k + 1];
                        end[k + 1] = temp3;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(start));
        System.out.println(Arrays.toString(end));
    }

    static int activities(int[] start, int[] end) {
        int max = 0;
        int cnt1 = 1;
        int f = 0;
        for (int j = 1; j < start.length; j++) {
            cnt1 = 1;
            f = 0;
            for (int i = j; i < start.length; i++) {
                if (start[i] >= end[f]) {
                    cnt1++;
                    f = i;
                }
                if (cnt1 > max) {
                    max = cnt1;
                }
            }
        }
        return max;
    }

    static void sort1(int[] start, int[] end) {
        for (int s = 0; s < start.length; s++) {
            for (int k = 0; k < start.length - 1; k++) {
                if ((start[k + 1] - end[k + 1]) > (start[k] - end[k])) {
                    int temp = 0;
                    temp = start[k];
                    start[k] = start[k + 1];
                    start[k + 1] = temp;
                    int temp1 = 0;
                    temp1 = end[k];
                    end[k] = end[k + 1];
                    end[k + 1] = temp1;
                }
            }
        }
        System.out.println(Arrays.toString(start));
        System.out.println(Arrays.toString(end));
    }

    static int activities1(int[] start, int[] end) {
        int max = 0;
        int cnt1 = 1;
        int f = 0;
        for (int j = 1; j < start.length; j++) {
            cnt1 = 1;
            f = 0;
            for (int i = j; i < start.length; i++) {
                if (start[i] >= end[f]) {
                    cnt1++;
                    f = i;
                }
                if (cnt1 > max) {
                    max = cnt1;
                }
            }
        }
        return max;
    }
}