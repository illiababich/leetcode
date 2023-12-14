import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import leetcode.P74;

public class P74Test {
    @Test
    public void testTargetPresent() {
        assertTrue(P74.searchMatrix(new int[][]{{1, 3, 5}, {7, 9, 11}, {13, 15, 17}}, 9));
    }

    @Test
    public void testTargetNotPresent() {
        assertFalse(P74.searchMatrix(new int[][]{{1, 3, 5}, {7, 9, 11}, {13, 15, 17}}, 8));
    }

    @Test
    public void testEmptyMatrix() {
        assertFalse(P74.searchMatrix(new int[][]{}, 5));
    }

    @Test
    public void testSingleRowMatrix() {
        assertTrue(P74.searchMatrix(new int[][]{{1, 2, 3, 4, 5}}, 3));
    }

    @Test
    public void testSingleColumnMatrix() {
        assertFalse(P74.searchMatrix(new int[][]{{1}, {3}, {5}}, 2));
    }

    @Test
    public void testLargeMatrix() {
        int[][] largeMatrix = new int[100][100];
        // Initialize largeMatrix with some values
        assertFalse(P74.searchMatrix(largeMatrix, 10001));
    }

    @Test
    public void testTargetAtBoundaries() {
        assertTrue(P74.searchMatrix(new int[][]{{1, 2}, {3, 4}}, 4));
    }

    @Test
    public void testMatrixWithNegativeNumbers() {
        assertTrue(P74.searchMatrix(new int[][]{{-10, -5, 0}, {1, 3, 5}}, -5));
    }
}
