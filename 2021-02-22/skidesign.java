
/*
ID: jiwonje2
LANG: JAVA
TASK: skidesign
*/
import java.io.*;
import java.util.*;

class skidesign {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("skidesign.in"));
        PrintWriter out = new PrintWriter(new FileWriter("skidesign.out"));
        int N = Integer.parseInt(f.readLine());
        Integer[] ar = new Integer[N];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = Integer.parseInt(f.readLine());
        }
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        // smallest total
        int st = Integer.MAX_VALUE;
        // total for every hill range
        int alltotal = 0;
        // smallest total
        int smallesttotal = Integer.MAX_VALUE;
        // check every range 0-17, 1-18, 2-19, etc..
        for (int i = 0; i < 84; i++) {
            // outside range
            int range = i + 17;
            alltotal = 0;
            // apply that range to every hill in the input
            for (int j = 0; j < ar.length; j++) {
                // accumulate the amount of change of every hill and calculate the total
                if (ar[j] < i) {
                    alltotal += Math.abs(ar[j] - i) * Math.abs(ar[j] - i);
                }
                if (ar[j] > range) {
                    alltotal += Math.abs(ar[j] - range) * Math.abs(ar[j] - range);
                }
            }
            // track the smallest total out of each range
            if (alltotal < smallesttotal) {
                smallesttotal = alltotal;
            }
            // debug
            System.out.println(i + " " + range);
            System.out.println(smallesttotal);
        }
        out.println(smallesttotal);
        out.close();
    }
}