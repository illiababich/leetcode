import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static leetcode.P2610.findMatrix;
import static org.junit.jupiter.api.Assertions.*;

class P2610Test {
    @Test
    public void testEmptyArray() {
        assertTrue(findMatrix(new int[]{}).isEmpty(), "Empty array should return an empty list");
    }

    @Test
    public void testUniqueElements() {
        List<List<Integer>> expected = List.of(Arrays.asList(1, 2, 3, 4));
        assertEquals(expected, findMatrix(new int[]{1, 2, 3, 4}), "Array with all unique elements");
    }

    @Test
    public void testAllSameElements() {
        List<List<Integer>> expected = Arrays.asList(List.of(1), List.of(1), List.of(1));
        assertEquals(expected, findMatrix(new int[]{1, 1, 1}), "Array with all same elements");
    }

    @Test
    public void testMixedElements() {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 3, 4, 2), Arrays.asList(1, 3), List.of(1));
        assertEquals(expected, findMatrix(new int[]{1, 3, 4, 1, 2, 3, 1}), "Array with mixed elements");
    }

    @Test
    public void testSingleElement() {
        List<List<Integer>> expected = List.of(List.of(5));
        assertEquals(expected, findMatrix(new int[]{5}), "Single element array");
    }

    @Test
    public void testLargeNumbers() {
                List<List<Integer>> expected = Arrays.asList(Arrays.asList(100, 200), List.of(100));
        assertEquals(expected, findMatrix(new int[]{100, 200, 100}), "Array with large numbers");
    }

    @Test
    public void testNegativeNumbers() {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, -2), List.of(-1));
        assertEquals(expected, findMatrix(new int[]{-1, -2, -1}), "Array with negative numbers");
    }

    @Test
    public void testIncreasingSequence() {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(2, 3), List.of(3));
        assertEquals(expected, findMatrix(new int[]{1, 2, 3, 2, 3, 3}), "Increasing sequence array");
    }

    @Test
    public void testDecreasingSequence() {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(3, 2, 1), Arrays.asList(2, 1), List.of(1));
        assertEquals(expected, findMatrix(new int[]{3, 2, 1, 2, 1, 1}), "Decreasing sequence array");
    }
}