
/*
ID: jiwonje2
LANG: JAVA
TASK: beads
*/
import java.util.*;
import java.io.*;

class beads {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("beads.in"));
        PrintWriter out = new PrintWriter(new FileWriter("beads.out"));

        int N = Integer.parseInt(f.readLine());
        String necklace = f.readLine();

        String[] beads = new String[N];
        for (int i = 0; i < beads.length; i++) {
            beads[i] = necklace.substring(i, i + 1);
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            int leftcount = countBeads(i, beads, -1);
            int rightcount = countBeads(i + 1, beads, 1);
            int count = rightcount + leftcount;
            System.out.println(count);
            System.out.println(beads.length);
            if (count > beads.length) {
                count = beads.length;
            }
            if (max < count) {
                max = count;
            }
        }
        System.out.println(max);
        out.println(max);
        out.close();
    }

    public static int countBeads(int location, String[] beads, int direction) {
        if (location >= beads.length) {
            location = 0;
        }

        String current = beads[location];
        int count = 1;
        while (true) {
            location += direction;
            if (location >= beads.length) {
                location = 0;
            } else if (location < 0) {
                location = beads.length - 1;
            }
            if (beads[location].equals(current) || beads[location].equals("w") || current.equals("w")) {
                if (current.equals("w")) {
                    current = beads[location];
                }
                count++;
                if (count > beads.length) {
                    return beads.length;
                }
            } else {
                break;
            }
        }

        return count;
    }
}