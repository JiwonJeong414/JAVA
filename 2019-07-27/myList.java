import java.util.ArrayList;
import java.util.*;

class myList {
    public static void main(String[] args) {
        int[] ar = { 1, 2, 3 };

        System.out.println(Arrays.toString(ar));

        int[] ar2 = new int[ar.length + 1];

        for (int i = 0; i < ar.length; i++) {
            ar2[i] = ar[i];
        }
        ar2[ar2.length - 1] = 4;
        System.out.println(Arrays.toString(ar2));

        ar = ar2;

        System.out.println(Arrays.toString(ar));

        // Array Lists
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);

        // .add(value)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);

        System.out.println(list);

        // .size()
        System.out.println(list.size());

        // .get(index)
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Looking to the right neighbor
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.println(list.get(i) + " " + list.get(i + 1));
        }

        // .remove(index)
        System.out.println(list);
        list.remove(2);
        list.remove((Integer) 2);
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("John");
        list2.add("Joe");
        list2.add("Jane");
        list2.add("John");
        list2.add("John");

        System.out.println(list2);

        list2.remove(2);
        System.out.println(list2);

        list2.remove("John");
        System.out.println(list2);

        // set
        // list.set(index, value) - > changes that index to value

        // size
        // list.size() - > return the length of the list

        // get
        // list.get(index) - > same as ar[i]
    }
}