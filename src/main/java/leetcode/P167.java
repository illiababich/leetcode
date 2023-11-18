package leetcode;

public class P167 {
    public static int[] twoSum(int[] nums, int target) {
        int left_pointer = 0;
        int right_pointer = nums.length - 1;

        while (right_pointer > left_pointer) {
            if (nums[left_pointer] + nums[right_pointer] == target) {
                return new int[] {left_pointer + 1, right_pointer + 1};
            }
            if (nums[left_pointer] + nums[right_pointer] > target) {
                --right_pointer;
            }
            if (nums[left_pointer] + nums[right_pointer] < target) {
                ++left_pointer;
            }
        }

        return null;
    }


}
