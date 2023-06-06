
/*
ID: jiwonje2
LANG: JAVA
TASK: milk
*/
import java.util.*;
import java.io.*;

class milk {
    static int[] price;
    static int[] units;

    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("milk.in"));
        PrintWriter out = new PrintWriter(new FileWriter("milk.out"));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cost = 0;
        int cost1 = N;
        price = new int[M];
        units = new int[M];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(f.readLine());
            price[i] = Integer.parseInt(st.nextToken());
            units[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < price.length; i++) {
            for (int j = i + 1; j < price.length; j++) {
                if (price[i] > price[j]) {
                    int temp = price[i];
                    price[i] = price[j];
                    price[j] = temp;
                    int temp1 = units[i];
                    units[i] = units[j];
                    units[j] = temp1;
                }
            }
        }
        System.out.println(Arrays.toString(price));
        System.out.println(Arrays.toString(units));
        for (int i = 0; i < M; i++) {
            if (N - units[i] <= 0) {
                cost += N * price[i];
                break;
            }
            cost += price[i] * units[i];
            N = N - units[i];
        }
        out.println(cost);
        out.close();
    }
}