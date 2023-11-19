import org.junit.jupiter.api.Test;
import leetcode.P9;

import static org.junit.jupiter.api.Assertions.*;


public class P9Test {
    @Test
    void testPositivePalindrome() {
        assertTrue(P9.isPalindrome(121));
    }

    @Test
    void testNegativePalindrome() {
        assertFalse(P9.isPalindrome(-121));
    }

    @Test
    void testSingleDigit() {
        assertTrue(P9.isPalindrome(7));
    }

    @Test
    void testZero() {
        assertTrue(P9.isPalindrome(0));
    }

    @Test
    void testLargePalindrome() {
        assertTrue(P9.isPalindrome(1234321));
    }

    @Test
    void testLargeNonPalindrome() {
        assertFalse(P9.isPalindrome(1234567));
    }

    @Test
    void testPalindromeWithZero() {
        assertTrue(P9.isPalindrome(202));
    }

    @Test
    void testNonPalindromeWithZero() {
        assertFalse(P9.isPalindrome(204));
    }

    @Test
    void testPalindromeWithEvenDigits() {
        assertTrue(P9.isPalindrome(1221));
    }

    @Test
    void testPalindromeWithOddDigits() {
        assertTrue(P9.isPalindrome(12321));
    }
}
