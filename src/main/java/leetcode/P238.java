package leetcode;

import java.util.Arrays;

public class P238 {
    public static int[] productExceptSelf(int[] nums) {
        if (nums.length == 0) {
            return new int[]{};
        }
        int length = nums.length;

        int[] right = new int[length];
        right[0] = 1;

        int[] result = new int[length];
        result[0] = 1;

        for (int i = 1; i < length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
            right[i] = right[i - 1] * nums[length - i];
        }

        for (int i = 0; i < length; i++) {
            result[i] = result[i] * right[length - 1 - i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(numbers)));
    }
}
