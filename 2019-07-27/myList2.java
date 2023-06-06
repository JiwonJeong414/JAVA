import java.util.ArrayList;
import java.util.*;

class myList2 {
    public static void main(String[] args) {
        System.out.println("Array");
        int maximum = 0;
        int[] ar = { 4, 3, 20, -1, -9 };
        int[] ar2 = new int[ar.length - 1];
        for (int i = 0; i < ar.length; i++) {
            if (maximum < ar[i]) {
                maximum = ar[i];
            }
        }
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] == maximum) {
                ar2[i] = ar[i + 1];
            }
            if (ar[i] != maximum) {
                ar2[i] = ar[i];
            }
        }
        if (ar[ar.length - 1] != maximum) {
            ar2[ar2.length - 1] = ar[ar.length - 1];
        }
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar2));

        // remove the maximum with arrays

        // array lists
        System.out.println("ArrayList");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            list.add(ar[i]);
        }
        int maxIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(maxIndex)) {
                maxIndex = i;
            }
        }
        int removed = list.remove(maxIndex);
        System.out.println("Removed: " + removed);
        System.out.println(list);
    }
}