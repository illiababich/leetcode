import org.junit.jupiter.api.Test;
import leetcode.P1657;

import static org.junit.jupiter.api.Assertions.*;

class P1657Test {
    @Test
    public void testEqualAndCloseStrings() {
        assertTrue(P1657.closeStrings("abc", "bca"));
    }

    @Test
    public void testEqualButNotCloseStrings() {
        assertFalse(P1657.closeStrings("abc", "def"));
    }

    @Test
    public void testDifferentLengthStrings() {
        assertFalse(P1657.closeStrings("abc", "ab"));
    }

    @Test
    public void testEmptyStrings() {
        assertTrue(P1657.closeStrings("", ""));
    }

    @Test
    public void testSameStringRepeatedCharacters() {
        assertTrue(P1657.closeStrings("aaabbb", "bbbaaa"));
    }

    @Test
    public void testStringsDifferentRepeatedCharacters() {
        assertFalse(P1657.closeStrings("aaa", "bbb"));
    }

    @Test
    public void testOneEmptyString() {
        assertFalse(P1657.closeStrings("", "abc"));
    }

    @Test
    public void testStringsSameCharactersSameFrequencyDifferentOrder() {
        assertTrue(P1657.closeStrings("aabcc", "abcac"));
    }

    @Test
    public void testStringsSameCharactersDifferentFrequency() {
        assertFalse(P1657.closeStrings("aabbccd", "aabbccc"));
    }
}