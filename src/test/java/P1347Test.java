import leetcode.P1347;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1347Test {
    @Test
    public void testEqualLengthSameCharacters() {
        assertEquals(0, P1347.minSteps("abc", "bca"));
    }

    @Test
    public void testEqualLengthDifferentCharacters() {
        assertEquals(3, P1347.minSteps("abc", "def"));
    }

    @Test
    public void testEmptyStrings() {
        assertEquals(0, P1347.minSteps("", ""));
    }

    @Test
    public void testSingleCharacterStrings() {
        assertEquals(0, P1347.minSteps("a", "a"));
    }

    @Test
    public void testAllCharactersDifferent() {
        assertEquals(3, P1347.minSteps("abc", "xyz"));
    }

    @Test
    public void testAllCharactersSame() {
        assertEquals(0, P1347.minSteps("aaa", "aaa"));
    }

    @Test
    public void testEqualLengthPartialMatch() {
        assertEquals(2, P1347.minSteps("abcd", "abef"));
    }

    @Test
    public void testNumericCharacters() {
        assertEquals(3, P1347.minSteps("123", "456"));
    }

    @Test
    public void testEqualLengthSubset() {
        assertEquals(1, P1347.minSteps("aabc", "abcd"));
    }
}