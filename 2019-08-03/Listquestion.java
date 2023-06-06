import java.util.ArrayList;
import java.util.*;

class Listquestion {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("john");
        list.add("jane");
        list.add("foo");
        list.add("john");
        list.add("john");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("john")) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(5);
        list2.add(3);
        list2.add(2);
        list2.add(4);

        // find the biggest adjacent pair and print those numbers
        int k = 0;
        int u = 0;
        String p = "";
        for (int i = 0; i < list2.size() - 1; i++) {
            k = list2.get(i) + list2.get(i + 1);
            if (k > u) {
                u = k;
                p = "biggest adjacent pair: " + (list2.get(i) + ",") + (list2.get(i + 1) + "");
            }
        }
        System.out.println(p);

        int[] ar = { 1, 5, 3, 2, 4 };
        int[] ar2 = new int[ar.length];
        // shift the array 1 time to the right - > [4, 1, 5, 3, 2]
        for (int i = 0; i < ar.length - 1; i++) {
            ar2[i] = ar[i];
            ar[i] = ar[i + 1];
        }
        ar[ar.length - 1] = ar2[0];
        System.out.println("shiftedleft: " + Arrays.toString(ar));
        int[] ar3 = { 1, 5, 3, 2, 4 };
        int temp = ar3[ar3.length - 1];
        for (int i = ar3.length - 2; i >= 0; i--) {
            ar3[i + 1] = ar3[i];
        }
        ar3[0] = temp;
        System.out.println("shiftedright: " + Arrays.toString(ar3));

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(5);
        list3.add(3);
        list3.add(2);
        list3.add(4);
        // shift to the right
        list3.add(0, list3.remove(list3.size() - 1));
        System.out.println(list3);
        for (int i = 0; i < 2; i++) {
            list3.add(list3.size() - 1, list3.remove(0));
        }
        System.out.println(list3);
    }
}