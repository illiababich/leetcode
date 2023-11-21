import org.junit.jupiter.api.Test;
import leetcode.P67;

import static org.junit.jupiter.api.Assertions.*;

public class P67Test {

    @Test
    void testAddBinary1() {
        assertEquals("100", P67.addBinary("11", "1"));
    }

    @Test
    void testAddBinary2() {
        assertEquals("10101", P67.addBinary("1010", "1011"));
    }

    @Test
    void testAddBinaryWithCarry() {
        assertEquals("1000", P67.addBinary("111", "1"));
    }

    @Test
    void testAddBinaryWithZeros() {
        assertEquals("0", P67.addBinary("0", "0"));
    }

    @Test
    void testAddBinaryWithEmptyStrings() {
        assertEquals("", P67.addBinary("", ""));
    }

    @Test
    void testAddBinaryWithOneEmptyString() {
        assertEquals("1010", P67.addBinary("1010", ""));
    }

    @Test
    void testAddBinaryWithLargeNumbers() {
        assertEquals("1000001", P67.addBinary("111111", "10"));
    }

    @Test
    void testAddBinaryWithDifferentLengths() {
        assertEquals("1001", P67.addBinary("110", "11"));
    }

    @Test
    void testAddBinaryWithSingleDigit() {
        assertEquals("1", P67.addBinary("1", "0"));
    }
}
