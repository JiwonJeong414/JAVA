
/*
ID: jiwonje2
LANG: JAVA
TASK: ride
*/
import java.util.*;
import java.io.*;

class ride {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("ride.in"));
        PrintWriter out = new PrintWriter(new FileWriter("ride.out"));

        String u = f.readLine();
        String m = f.readLine();
        char[] ar = u.toCharArray();
        char[] ar2 = m.toCharArray();
        int p = 1;
        int c = 1;
        for (int i = 0; i < ar.length; i++) {
            p *= (ar[i] - 64);
        }
        for (int i = 0; i < ar2.length; i++) {
            c *= (ar2[i] - 64);
        }
        if ((p % 47) == (c % 47)) {
            System.out.println("GO");
            out.println("GO");
            out.close();
        } else {
            System.out.println("STAY");
            out.println("STAY");
            out.close();
        }
    }
}