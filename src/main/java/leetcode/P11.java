package leetcode;

public class P11 {
    public static int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }

        int left = 0, right = height.length - 1, result = 0;

        while (left < right) {
            int temp = Math.min(height[left], height[right]) * Math.abs((right + 1) - (left + 1));
            if (temp > result) {
                result = temp;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}
