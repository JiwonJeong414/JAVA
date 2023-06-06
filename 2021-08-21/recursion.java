import java.io.*;
import java.util.*;

class recursion {
    static int[] nums = { 5, 2, 3 };

    public static void main(String[] args) throws Exception {
        System.out.println(solve(nums, 0, 0, 0));
        System.out.println(solve2(nums));
        System.out.println(solve3(nums, 0, 0, 0));
        System.out.println(solve4(nums, 0, 0, 0));
    }

    // first way
    static boolean solve(int[] nums, int i, int l, int r) {

        if (i == nums.length)
            return l == r;

        return solve(nums, i + 1, l + nums[i], r) || solve(nums, i + 1, l, r + nums[i]);
    }

    // optimized way
    static boolean solve2(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if (sum % 2 != 0)
            return false;

        return subsolve(nums, 0, 0, sum / 2);
    }

    static boolean subsolve(int[] nums, int i, int l, int target) {

        if (l == target)
            return true;
        if (l > target)
            return false;
        if (i == nums.length)
            return false;

        return subsolve(nums, i + 1, l + nums[i], target) || subsolve(nums, i + 1, l, target);
    }

    // second question
    static boolean solve3(int[] nums, int i, int l, int r) {

        if (i == nums.length)
            return (l % 10 == 0) && (r % 2 == 1);

        return solve(nums, i + 1, l + nums[i], r) || solve(nums, i + 1, l, r + nums[i]);
    }

    // third question
    static boolean solve4(int[] nums, int i, int l, int r) {

        if (i == nums.length)
            return l == r;

        if (nums[i] % 3 == 0) {
            return solve(nums, i + 1, l + nums[i], r);
        }
        if (nums[i] % 5 == 0) {
            return solve(nums, i + 1, l, r + nums[i]);
        } else {
            return solve(nums, i + 1, l + nums[i], r) || solve(nums, i + 1, l, r + nums[i]);
        }
    }
}
