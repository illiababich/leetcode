import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import leetcode.P347;

import java.util.Arrays;

public class P347Test {
    @Test
    void testTopKFrequent1() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] result = P347.topKFrequent(nums, k);
        assertTrue(Arrays.equals(new int[]{1, 2}, result) || Arrays.equals(new int[]{2, 1}, result));
    }

    @Test
    void testTopKFrequent2() {
        int[] nums = {1};
        int k = 1;
        int[] result = P347.topKFrequent(nums, k);
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    void testTopKFrequentWithNegativeNumbers() {
        int[] nums = {-1, -1, -1, -2, -2, -3};
        int k = 2;
        int[] result = P347.topKFrequent(nums, k);
        assertTrue(Arrays.equals(new int[]{-1, -2}, result) || Arrays.equals(new int[]{-2, -1}, result));
    }

    @Test
    void testTopKFrequentWithLargeNumbers() {
        int[] nums = {1000000, 1000000, 1000000, 2000000, 2000000, 3000000};
        int k = 2;
        int[] result = P347.topKFrequent(nums, k);
        assertTrue(Arrays.equals(new int[]{1000000, 2000000}, result) || Arrays.equals(new int[]{2000000, 1000000}, result));
    }

    @Test
    void testTopKFrequentWithAllSameNumbers() {
        int[] nums = {1, 1, 1, 1, 1, 1};
        int k = 1;
        int[] result = P347.topKFrequent(nums, k);
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    void testTopKFrequentWithNoDuplicates() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 3;
        int[] result = P347.topKFrequent(nums, k);
        assertTrue(Arrays.equals(new int[]{1, 2, 3}, result) || Arrays.equals(new int[]{1, 3, 2}, result) || Arrays.equals(new int[]{2, 1, 3}, result) || Arrays.equals(new int[]{2, 3, 1}, result) || Arrays.equals(new int[]{3, 1, 2}, result) || Arrays.equals(new int[]{3, 2, 1}, result));
    }
}
