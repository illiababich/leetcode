import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static leetcode.P2870.minOperations;

class P2870Test {
    @Test
    public void testEmptyArray() {
        assertEquals(0, minOperations(new int[] {}));
    }

    @Test
    public void testSingleElement() {
        assertEquals(-1, minOperations(new int[] {1}));
    }

    @Test
    public void testTwoDifferentElements() {
        assertEquals(-1, minOperations(new int[] {1, 2}));
    }

    @Test
    public void testTwoSameElements() {
        assertEquals(1, minOperations(new int[] {1, 1}));
    }

    @Test
    public void testThreeSameElements() {
        assertEquals(1, minOperations(new int[] {1, 1, 1}));
    }

    @Test
    public void testFourSameElements() {
        assertEquals(2, minOperations(new int[] {1, 1, 1, 1}));
    }

    @Test
    public void testExample1() {
        assertEquals(4, minOperations(new int[] {2,3,3,2,2,4,2,3,4}));
    }

    @Test
    public void testExample2() {
        assertEquals(-1, minOperations(new int[] {2,1,2,2,3,3}));
    }

    @Test
    public void testAllSameElements() {
        int[] allSame = new int[1000];
        Arrays.fill(allSame, 1);
        assertEquals(334, minOperations(allSame));
    }
}