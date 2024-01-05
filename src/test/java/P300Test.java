import leetcode.P300;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P300Test {
    private final P300 solution = new P300();

    @Test
    public void testEmptyArray() {
        assertEquals(0, solution.lengthOfLIS(new int[] {}));
    }

    @Test
    public void testSingleElement() {
        assertEquals(1, solution.lengthOfLIS(new int[] {1}));
    }

    @Test
    public void testTwoDifferentElements() {
        assertEquals(1, solution.lengthOfLIS(new int[] {2, 1}));
    }

    @Test
    public void testTwoSameElements() {
        assertEquals(1, solution.lengthOfLIS(new int[] {1, 1}));
    }

    @Test
    public void testThreeSameElements() {
        assertEquals(1, solution.lengthOfLIS(new int[] {1, 1, 1}));
    }

    @Test
    public void testIncreasingElements() {
        assertEquals(5, solution.lengthOfLIS(new int[] {1, 2, 3, 4, 5}));
    }

    @Test
    public void testDecreasingElements() {
        assertEquals(1, solution.lengthOfLIS(new int[] {5, 4, 3, 2, 1}));
    }

    @Test
    public void testExample1() {
        assertEquals(4, solution.lengthOfLIS(new int[] {10, 9, 2, 5, 3, 7, 101, 18}));
    }

    @Test
    public void testExample2() {
        assertEquals(4, solution.lengthOfLIS(new int[] {0, 1, 0, 3, 2, 3}));
    }

    @Test
    public void testExample3() {
        assertEquals(1, solution.lengthOfLIS(new int[] {7, 7, 7, 7, 7, 7, 7}));
    }
}