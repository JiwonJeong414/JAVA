import java.io.*;
import java.util.*;

class cow {

    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("buckets.in"));
        PrintWriter out = new PrintWriter(new FileWriter("buckets.out"));

        int Br = 0;
        int Bc = 0;
        int Lr = 0;
        int Lc = 0;
        int Rr = 0;
        int Rc = 0;
        for (int i = 0; i < 10; i++) {
            String line = f.readLine();

            // ex: changes hello to ['h','e','l','l','o']
            char[] ar = line.toCharArray();

            for (int j = 0; j < ar.length; j++) {
                if (ar[j] == 'B') {
                    Br = i;
                    Bc = j;
                }
                if (ar[j] == 'L') {
                    Lr = i;
                    Lc = j;
                }
                if (ar[j] == 'R') {
                    Rr = i;
                    Rc = j;
                }
            }
        }
        if ((Rr == Lr && Lr == Br && (Bc < Rc && Rc < Lc || Lc < Rc && Rc < Bc))
                || (Rc == Lc && Lc == Bc && (Br < Rr && Rr < Lr || Lr < Rr && Rr < Br))) {
            System.out.println((Math.abs(Lc - Bc)) + (Math.abs(Lr - Br)) + 1);
            out.println((Math.abs(Lc - Bc)) + (Math.abs(Lr - Br)) + 1);
            out.close();
        } else {
            System.out.println((Math.abs(Lc - Bc)) + (Math.abs(Lr - Br)) - 1);
            out.println((Math.abs(Lc - Bc)) + (Math.abs(Lr - Br)) - 1);
            out.close();
        }
    }
}