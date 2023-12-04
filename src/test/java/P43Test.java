import org.junit.jupiter.api.Test;
import leetcode.P43;

import static org.junit.jupiter.api.Assertions.*;

public class P43Test {
    @Test
    void testMultiplySmallNumbers() {
        assertEquals("6", P43.multiply("2", "3"));
    }

    @Test
    void testMultiplyLargeNumbers() {
        assertEquals("56088", P43.multiply("123", "456"));
    }

    @Test
    void testMultiplyWithZero() {
        assertEquals("0", P43.multiply("12345", "0"));
    }

    @Test
    void testMultiplyWithOne() {
        assertEquals("12345", P43.multiply("12345", "1"));
    }

    @Test
    void testMultiplyWithItself() {
        assertEquals("15129", P43.multiply("123", "123"));
    }

    @Test
    void testMultiplyWithEmptyString() {
        assertEquals("0", P43.multiply("", "123"));
    }

    @Test
    void testMultiplyTwoEmptyStrings() {
        assertEquals("0", P43.multiply("", ""));
    }

    @Test
    void testMultiplyWithLargeResult() {
        assertEquals("998001", P43.multiply("999", "999"));
    }

    @Test
    void testMultiplyWithLeadingZeros() {
        assertEquals("200", P43.multiply("020", "010"));
    }
}
