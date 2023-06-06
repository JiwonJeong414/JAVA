import java.util.*;
import java.io.*;

class subsets1 {
    static int[] nums = { 2, 4, 8 };

    public static void main(String[] args) throws Exception {
        System.out.println(groupSum(0, nums, 10));
        // System.out.println(groupSum6(0, nums, 16));
        // System.out.println(groupNoAdj(0, nums, 12));
        // System.out.println(groupSumClump(0, nums, 9));
    }

    static HashMap<Integer, Integer> m = new HashMap<>();

    static boolean groupSumClump(int start, int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
        }
        int[] ar = new int[m.size()];
        System.out.println(m);
        int cnt = 0;
        for (Integer key : m.keySet()) {
            ar[cnt] = (key * m.get(key));
            cnt++;
        }
        System.out.println(Arrays.toString(ar));
        return solve(0, ar, target);
    }

    static boolean solve(int i, int[] nums, int target) {

        if (i == nums.length)
            return target == 0;

        return solve(i + 1, nums, target - nums[i]) || solve(i + 1, nums, target);
    }

    static int target2;
    static int number;

    static boolean groupNoAdj(int i, int[] nums, int target) {
        System.out.println(target);
        if (i != nums.length) {
            System.out.println("nums[i]: " + nums[i]);
        }

        if (i == nums.length)
            return target == 0;

        if (i != nums.length && target + number == target2) {
            System.out.println("target2: " + target2);
            System.out.println("target3: " + (target + number));
            return groupNoAdj(i + 1, nums, target);
        } else {
            target2 = target;
            number = nums[i];
            return groupNoAdj(i + 1, nums, target - nums[i]);
        }
    }

    static boolean groupSum(int i, int[] nums, int target) {
        System.out.println("index: " + i + " target: " + target);

        if (i == nums.length)
            return target == 0;

        return groupSum(i + 1, nums, target - nums[i]) || groupSum(i + 1, nums, target);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static int cnt;

    static boolean groupSum6(int i, int[] nums, int target) {
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 6) {
                cnt++;
            } else {
                list.add(nums[j]);
            }
        }
        int[] ar = new int[list.size()];
        int counter = 0;
        for (int s : list) {
            ar[counter] = s;
            counter++;
        }
        int target2 = target - (6 * cnt);
        return answer(0, ar, target2);
    }

    static boolean answer(int i, int[] nums, int target2) {

        if (i == nums.length)
            return target2 == 0;

        return answer(i + 1, nums, target2 - nums[i]) || answer(i + 1, nums, target2);
    }

}
