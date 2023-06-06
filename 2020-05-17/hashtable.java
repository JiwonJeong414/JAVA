import java.util.*;

public class hashtable {
    public static void main(String[] args) {
        int[] ar = { -1, 2, 3, 2, -1, 999999 };
        System.out.println("answer: " + findDuplicates(ar));
    }

    static Set<Integer> findDuplicates(int[] ar) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> setDup = new TreeSet<>((a, b) -> b - a);

        for (int v : ar) {
            if (set.contains(v))
                setDup.add(v);

            set.add(v);
            System.out.println(set);
        }

        return setDup;
    }

}