import java.util.*;
import java.io.*;

class censor {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("censor.in"));
        PrintWriter out = new PrintWriter(new FileWriter("censor.out"));

        ArrayList<String> list = new ArrayList<>();
        String S = f.readLine();
        String T = f.readLine();

        for (int i = 0; i < S.length(); i++) {
            list.add(S.substring(i, i + 1));
            // if (list.get(i - T.length()) == T.substring(0, 1)) {

            // }
            System.out.println(list.get(i - T.length()));
        }

        // String answer = "";
        // for (int i = 0; i < list.size(); i++) {
        // answer += list.get(i);
        // }
        // System.out.println(list);
        // System.out.println(answer);

        // out.println(answer);
        // out.close();
    }
}