import org.junit.jupiter.api.Test;
import leetcode.P66;

import static org.junit.jupiter.api.Assertions.*;

public class P66Test {
    @Test
    public void testEmptyArray() {
        assertArrayEquals(new int[]{1}, P66.plusOne(new int[]{}));
    }

    @Test
    public void testSingleDigit() {
        assertArrayEquals(new int[]{2}, P66.plusOne(new int[]{1}));
    }

    @Test
    public void testNoCarryCase() {
        assertArrayEquals(new int[]{1, 2, 4}, P66.plusOne(new int[]{1, 2, 3}));
    }

    @Test
    public void testSimpleCarryCase() {
        assertArrayEquals(new int[]{1, 3, 0}, P66.plusOne(new int[]{1, 2, 9}));
    }

    @Test
    public void testMultipleCarryCase() {
        assertArrayEquals(new int[]{1, 0, 0, 0}, P66.plusOne(new int[]{9, 9, 9}));
    }

    @Test
    public void testAllNines() {
        assertArrayEquals(new int[]{1, 0, 0, 0, 0}, P66.plusOne(new int[]{9, 9, 9, 9}));
    }

    @Test
    public void testLargeArray() {
        int[] largeArray = new int[1000];
        largeArray[999] = 8;
        int[] expectedArray = new int[1000];
        expectedArray[999] = 9;
        assertArrayEquals(expectedArray, P66.plusOne(largeArray));
    }

    @Test
    public void testRandomArray() {
        assertArrayEquals(new int[]{1, 2, 3, 5}, P66.plusOne(new int[]{1, 2, 3, 4}));
    }
}
