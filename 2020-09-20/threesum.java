import java.util.*;

public class threesum {
    public static void main(String[] args) {
        int[] ar = { 9, 2, 8, 4, 3, 6, 12, 11, 1 };
        int target = 8;

        // naive
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                for (int k = j + 1; k < ar.length; k++) {
                    if (ar[i] + ar[j] + ar[k] == target) {
                        System.out.println(ar[i] + " " + ar[j] + " " + ar[k]);
                    }
                }
            }
        }
        // HashSet
        for (int i = 0; i < ar.length; i++) {
            int newTarget = target - ar[i];
            HashSet<Integer> set = new HashSet<>();
            for (int j = i + 1; j < ar.length; j++) {
                if (set.contains(ar[j])) {
                    System.out.println(ar[i] + " " + (newTarget - ar[j]) + " " + ar[j]);
                }
                set.add(newTarget - ar[j]);
            }
        }
    }
}
