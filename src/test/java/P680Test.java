import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import leetcode.P680;

public class P680Test {
    @Test
    void testEmptyString() {
        assertTrue(P680.validPalindrome(""));
    }

    @Test
    void testSingleCharacter() {
        assertTrue(P680.validPalindrome("a"));
    }

    @Test
    void testTwoSameCharacters() {
        assertTrue(P680.validPalindrome("aa"));
    }

    @Test
    void testTwoDifferentCharacters() {
        assertTrue(P680.validPalindrome("ab"));
    }

    @Test
    void testAlreadyPalindrome() {
        assertTrue(P680.validPalindrome("radar"));
    }

    @Test
    void testPalindromeAfterRemovingOneCharacter() {
        assertTrue(P680.validPalindrome("radkar"));
    }

    @Test
    void testNotAPalindromeEvenAfterRemovingOneCharacter() {
        assertFalse(P680.validPalindrome("abcde"));
    }

    @Test
    void testLongPalindrome() {
        assertTrue(P680.validPalindrome("anaviddivana"));
    }

    @Test
    void testLongNonPalindrome() {
        assertFalse(P680.validPalindrome("anaviddivanb"));
    }

    @Test
    void testPalindromeWithMultipleOptionsToRemove() {
        assertTrue(P680.validPalindrome("abca"));
    }
}
