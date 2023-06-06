import java.util.*;
import java.io.*;

class s7 {
    public static void main(String[] args) throws Exception {
        // BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader f = new BufferedReader(new FileReader("input3.in"));
        char[] a = f.readLine().toCharArray();
        for (int i = 1;; i++) {

            if (a[0] == '-') {
                System.out.println(0);
            }

            int o_cnt = 0;
            int changes = 0;

            for (char c : a) {
                if (c == '{')
                    o_cnt++;
                else {
                    if (o_cnt == 0) {
                        changes++;
                        o_cnt++;
                    } else {
                        o_cnt--;
                    }
                }
            }

            changes += o_cnt / 2;
            if (o_cnt % 2 == 1) {
                changes++;
            }
        }
    }
}