import java.util.*;

class exercise {
    public static void main(String[] args) {

        int[] ar = { 177, 292, 300, 4912, 576, 682 };
        int[] ar3 = { 1, 3, 5 };

        System.out.println(Arrays.toString(shiftByN(ar, 10)));
        System.out.println(Arrays.toString(dup(ar3, 10)));
        // code ShiftByN where it will shift the array n times to the left
    }

    public static int[] shiftByN(int[] ar, int n) {
        int[] ar2 = new int[ar.length];
        for (int j = 0; j < n; j++) {
            for (int i = 1; i < ar.length; i++) {
                ar2[i - 1] = ar[i];
                ar2[ar2.length - 1] = ar[0];
            }
            for (int s = 0; s < ar.length; s++) {
                ar[s] = ar2[s];
            }
        }
        return ar;
    }

    public static int[] dup(int[] ar3, int n) {
        int[] ar4 = new int[ar3.length * n];
        int location = 0;
        for (int i = 0; i < ar3.length; i++) {
            for (int j = 0; j < n; j++) {
                ar4[location] = ar3[i];
                location++;
            }
        }
        return ar4;
    }
}