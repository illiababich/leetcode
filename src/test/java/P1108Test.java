import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import leetcode.P1108;

public class P1108Test {
    @Test
    public void testWithAllZeros() {
        assertEquals("0[.]0[.]0[.]0", P1108.defangIPaddr("0.0.0.0"));
    }

    @Test
    public void testWithAllOnes() {
        assertEquals("1[.]1[.]1[.]1", P1108.defangIPaddr("1.1.1.1"));
    }

    @Test
    public void testWithAlternatingZerosAndOnes() {
        assertEquals("0[.]1[.]0[.]1", P1108.defangIPaddr("0.1.0.1"));
    }

    @Test
    public void testWithAlternatingOnesAndZeros() {
        assertEquals("1[.]0[.]1[.]0", P1108.defangIPaddr("1.0.1.0"));
    }

    @Test
    public void testWithRandomNumbers() {
        assertEquals("192[.]168[.]1[.]1", P1108.defangIPaddr("192.168.1.1"));
    }

    @Test
    public void testWithMaximumValues() {
        assertEquals("255[.]255[.]255[.]255", P1108.defangIPaddr("255.255.255.255"));
    }

    @Test
    public void testWithMinimumAndMaximumValues() {
        assertEquals("0[.]0[.]0[.]255", P1108.defangIPaddr("0.0.0.255"));
    }

    @Test
    public void testWithRandomValues() {
        assertEquals("10[.]0[.]0[.]1", P1108.defangIPaddr("10.0.0.1"));
    }

    @Test
    public void testWithAnotherRandomValues() {
        assertEquals("172[.]16[.]254[.]1", P1108.defangIPaddr("172.16.254.1"));
    }

    @Test
    public void testWithYetAnotherRandomValues() {
        assertEquals("203[.]0[.]113[.]195", P1108.defangIPaddr("203.0.113.195"));
    }
}