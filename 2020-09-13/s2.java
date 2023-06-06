import java.util.*;
import java.io.*;

class s2 {
    public static void main(String[] args) {
        int[] ar = { 2, 1, 4, 5, 3, 4, 1, 2 };
        for (int i = 0; i < ar.length - 3; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < 4; j++) {
                if (ar[j + i] < min) {
                    min = ar[j + i];
                }
            }
            System.out.println(min);
        }
    }
}
