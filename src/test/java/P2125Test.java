import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static leetcode.P2125.numberOfBeams;

class P2125Test {
    @Test
    public void testEmptyArray() {
        assertEquals(0, numberOfBeams(new String[] {}));
    }

    @Test
    public void testSingleRow() {
        assertEquals(0, numberOfBeams(new String[] {"10101"}));
    }

    @Test
    public void testTwoRowsNoBeams() {
        assertEquals(0, numberOfBeams(new String[] {"1000", "0000"}));
    }

    @Test
    public void testMultipleRowsWithBeams() {
        assertEquals(8, numberOfBeams(new String[] {"011001", "010100", "001000"}));
    }

    @Test
    public void testAllZeros() {
        assertEquals(0, numberOfBeams(new String[] {"000", "000", "000"}));
    }

    @Test
    public void testAllOnes() {
        assertEquals(18, numberOfBeams(new String[] {"111", "111", "111"}));
    }

    @Test
    public void testAlternateOnesAndZeros() {
        assertEquals(4, numberOfBeams(new String[] {"1010", "0101"}));
    }

    @Test
    public void testSingleOneInEachRow() {
        assertEquals(2, numberOfBeams(new String[] {"100", "010", "001"}));
    }
}