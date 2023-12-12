import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import leetcode.P704;

public class P704Test {
    @Test
    public void testTargetPresent() {
        assertEquals(2, P704.search(new int[]{1, 3, 5, 7, 9}, 5));
    }

    @Test
    public void testTargetNotPresent() {
        assertEquals(-1, P704.search(new int[]{1, 3, 5, 7, 9}, 6));
    }

    @Test
    public void testEmptyArray() {
        assertEquals(-1, P704.search(new int[]{}, 3));
    }

    @Test
    public void testSingleElementArrayPresent() {
        assertEquals(0, P704.search(new int[]{5}, 5));
    }

    @Test
    public void testSingleElementArrayAbsent() {
        assertEquals(-1, P704.search(new int[]{5}, 3));
    }

    @Test
    public void testLargeArray() {
        int[] largeArray = new int[1000];
        for (int i = 0; i < 1000; i++) {
            largeArray[i] = i * 2;
        }
        assertEquals(500, P704.search(largeArray, 1000));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals(3, P704.search(new int[]{-10, -5, -3, -1}, -1));
    }

    @Test
    public void testDuplicatesInArray() {
        assertEquals(4, P704.search(new int[]{1, 3, 3, 5, 5, 7}, 5));
    }

    @Test
    public void testTargetAtEnds() {
        assertEquals(0, P704.search(new int[]{3, 5, 7, 9, 11}, 3));
        assertEquals(4, P704.search(new int[]{3, 5, 7, 9, 11}, 11));
    }
}
