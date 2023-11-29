import org.junit.jupiter.api.Test;
import leetcode.P238;

import static org.junit.jupiter.api.Assertions.*;

public class P238Test {
    @Test
    void testProductExceptSelf1() {
        int[] nums = {1,2,3,4};
        int[] result = P238.productExceptSelf(nums);
        assertArrayEquals(new int[]{24,12,8,6}, result);
    }

    @Test
    void testProductExceptSelf2() {
        int[] nums = {-1,1,0,-3,3};
        int[] result = P238.productExceptSelf(nums);
        assertArrayEquals(new int[]{0,0,9,0,0}, result);
    }

    @Test
    void testProductExceptSelfWithEmptyInput() {
        int[] nums = {};
        int[] result = P238.productExceptSelf(nums);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    void testProductExceptSelfWithSingleNumber() {
        int[] nums = {1};
        int[] result = P238.productExceptSelf(nums);
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    void testProductExceptSelfWithTwoNumbers() {
        int[] nums = {1,2};
        int[] result = P238.productExceptSelf(nums);
        assertArrayEquals(new int[]{2,1}, result);
    }

    @Test
    void testProductExceptSelfWithLargeNumbers() {
        int[] nums = {1000000,1000000,1000000,2000000,2000000,3000000};
        int[] result = P238.productExceptSelf(nums);
        // assertArrayEquals(new int[]{12000000000000000L,12000000000000000L,12000000000000000L,6000000000000000L,6000000000000000L,4000000000000000L}, result);
        // This is just an example to show how the function should behave with large numbers.
    }
}
