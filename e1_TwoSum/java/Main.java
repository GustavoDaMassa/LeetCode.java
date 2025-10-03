package e1_TwoSum.java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Input nums: " + Arrays.toString(nums));
        System.out.println("Input target: " + target);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
