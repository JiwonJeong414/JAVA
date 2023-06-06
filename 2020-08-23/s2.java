import java.util.*;
import java.io.*;

class s2 {
    public static void main(String args[]) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("input1.in"));
        String a = f.readLine();
        String b = f.readLine();
        System.out.println(ed(a, b));
    }

    static int ed(String a, String b) {
        return ed(a, b, a.length(), b.length());
    }

    static int ed(String a, String b, int alen, int blen) {
        if (alen == 0)
            return blen;
        if (blen == 0)
            return alen;

        if (a.charAt(alen - 1) == b.charAt(blen - 1))
            return ed(a, b, alen - 1, blen - 1);

        return 1 + min(ed(a, b, alen, blen - 1), ed(a, b, alen - 1, blen), ed(a, b, alen - 1, blen - 1));
    }

    static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}