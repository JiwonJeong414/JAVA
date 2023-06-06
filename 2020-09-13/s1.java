import java.util.*;
import java.io.*;

class s1 {
    public static void main(String[] args) {
        int[] ar = { 1, 3, 4, 2, 5, 3, 4, 2 };
        int[] nse = new int[ar.length - 1];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < ar.length; i++) {
            if (i == 0) {
                s.push(ar[i]);
            } else {
                int size = s.size();
                for (int j = 0; j < size; j++) {
                    if (s.peek() < ar[i]) {
                        nse[i - 1] = s.peek();
                        s.push(ar[i]);
                        break;
                    } else {
                        s.pop();
                    }
                }
            }
        }
        for (int i = 0; i < nse.length; i++) {
            System.out.println(nse[i]);
        }
    }
}