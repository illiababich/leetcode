import org.junit.jupiter.api.Test;
import leetcode.P11;

import static org.junit.jupiter.api.Assertions.*;

class P11Test {

    @Test
    public void testEmptyArray() {
        assertEquals(0, P11.maxArea(new int[] {}), "The maximum area for an empty array should be 0");
    }

    @Test
    public void testSingleElement() {
        assertEquals(0, P11.maxArea(new int[] {1}), "The maximum area for a single element array should be 0");
    }

    @Test
    public void testTwoElements() {
        assertEquals(1, P11.maxArea(new int[] {1, 1}), "The maximum area for two elements of height 1 should be 1");
    }

    @Test
    public void testStandardCase() {
        assertEquals(49, P11.maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}), "Expected maximum area is 49 for this standard case");
    }

    @Test
    public void testAllSameHeight() {
        assertEquals(20, P11.maxArea(new int[] {5, 5, 5, 5, 5}), "The maximum area for equal height elements should be the product of height and width minus one");
    }

    @Test
    public void testDecreasingHeight() {
        assertEquals(16, P11.maxArea(new int[] {8, 7, 6, 5, 4, 3, 2, 1}), "Expected maximum area for decreasing height array");
    }

    @Test
    public void testIncreasingHeight() {
        assertEquals(16, P11.maxArea(new int[] {1, 2, 3, 4, 5, 6, 7, 8}), "Expected maximum area for increasing height array");
    }

    @Test
    public void testLargeNumbers() {
        assertEquals(100000, P11.maxArea(new int[] {50000, 1, 50000}), "Expected maximum area for large numbers");
    }
}