import java.util.*;
import java.io.*;

public class measurement {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("measurement.in")); 
        int N = Integer.parseInt(f.readLine());
        int G = Integer.parseInt(f.readLine());

        Input[] inputs = new Input[N];
        for (int i = 0; i < N; i++) {
            inputs[i] = new Input(Integer.parseInt(f.readLine()));
        }
        //debug
        Arrays.sort(inputs,(a, b) -> a.day-b.day);
        for(Input inp : inputs){
            System.out.println(inp.day + ", " + inp.cow + ", " + inp.delta);
        }

        // ----- end of input
        // amt // cow number
        TreeMap<Integer,Integer>
    }

    static class Input {
        int day, cow, delta;

        Input(int d, int c, int de) {
            day = d;
            cow = c;
            delta = de;
        }
    }
}