import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import leetcode.P1207;

class P1207Test {
    @Test
    public void testEmptyArray() {
        int[] arr = {};
        assertTrue(P1207.uniqueOccurrences(arr));
    }

    @Test
    public void testSingleElement() {
        int[] arr = {1};
        assertTrue(P1207.uniqueOccurrences(arr));
    }

    @Test
    public void testP1207() {
        int[] arr = {1, 2, 2, 3, 3, 3};
        assertTrue(P1207.uniqueOccurrences(arr));
    }

    @Test
    public void testAllSameElement() {
        int[] arr = {2, 2, 2, 2};
        assertTrue(P1207.uniqueOccurrences(arr));
    }

    @Test
    public void testNegativeNumbers() {
        int[] arr = {-1, -1, -2, -2, -2, -3};
        assertTrue(P1207.uniqueOccurrences(arr));
    }

    @Test
    public void testLargeArray() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 10; // Repeating numbers
        }
        assertFalse(P1207.uniqueOccurrences(arr));
    }

    @Test
    public void testZeros() {
        int[] arr = {0, 0, 0, 1, 1};
        assertTrue(P1207.uniqueOccurrences(arr));
    }

    @Test
    public void testLargeNumbers() {
        int[] arr = {1000000, 1000000, 2000000};
        assertTrue(P1207.uniqueOccurrences(arr));
    }
}