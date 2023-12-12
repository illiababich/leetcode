package leetcode;

public class P704 {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (left == right) {
            return nums[0] == target ? 0 : -1;
        }

        while (left <= right) {
            int middle = left + ((right - left) / 2);
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
}
