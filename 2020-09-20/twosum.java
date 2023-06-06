import java.util.*;

public class twosum {
    public static void main(String[] args) {
        int[] ar = { 9, 2, 8, 4, 3, 6, 12, 11, 1 };
        int target = 8;
        // naive O(n^2)
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] + ar[j] == target) {
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
        // HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < ar.length; i++) {
            if (set.contains(ar[i])) {
                System.out.println(target - ar[i] + " " + ar[i]);
            }
            set.add(target - ar[i]);
        }
        // two-pointer
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        int i = 0;
        int j = ar.length - 1;
        while (i < j) {
            if (ar[i] + ar[j] > target) {
                j--;
            } else if (ar[i] + ar[j] < target) {
                i++;
            } else {
                System.out.println(ar[i] + " " + ar[j]);
                break;
            }
        }
    }
}
