import org.junit.jupiter.api.Test;
import leetcode.P128;

import static org.junit.jupiter.api.Assertions.*;

public class P128Test {
    @Test
    void testLongestConsecutive1() {
        int[] nums = {100,4,200,1,3,2};
        int result = P128.longestConsecutive(nums);
        assertEquals(4, result);
    }

    @Test
    void testLongestConsecutive2() {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        int result = P128.longestConsecutive(nums);
        assertEquals(9, result);
    }

    @Test
    void testLongestConsecutiveWithEmptyInput() {
        int[] nums = {};
        int result = P128.longestConsecutive(nums);
        assertEquals(0, result);
    }

    @Test
    void testLongestConsecutiveWithSingleNumber() {
        int[] nums = {1};
        int result = P128.longestConsecutive(nums);
        assertEquals(1, result);
    }

    @Test
    void testLongestConsecutiveWithSameNumber() {
        int[] nums = {2,2,2,2,2};
        int result = P128.longestConsecutive(nums);
        assertEquals(1, result);
    }

    @Test
    void testLongestConsecutiveWithLargeNumbers() {
        int[] nums = {1000000,1000000,1000000,2000000,2000000,3000000};
        int result = P128.longestConsecutive(nums);
        assertEquals(1, result);
    }
}
