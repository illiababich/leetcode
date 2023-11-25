import leetcode.P242;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class P242Test {
    @Test
    void testValidAnagram1() {
        assertTrue(P242.isAnagram("anagram", "nagaram"));
    }

    @Test
    void testValidAnagram2() {
        assertFalse(P242.isAnagram("rat", "car"));
    }

    @Test
    void testEmptyStrings() {
        assertTrue(P242.isAnagram("", ""));
    }

    @Test
    void testSingleCharacter() {
        assertTrue(P242.isAnagram("a", "a"));
    }

    @Test
    void testDifferentLengths() {
        assertFalse(P242.isAnagram("a", "ab"));
    }

    @Test
    void testSameCharactersDifferentCounts() {
        assertFalse(P242.isAnagram("aa", "a"));
    }

    @Test
    void testLargeStrings() {
        assertTrue(P242.isAnagram("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcba"));
    }

    @Test
    void testUnicodeCharacters() {
        assertTrue(P242.isAnagram("こんにちは", "はちにんこ"));
    }
}
