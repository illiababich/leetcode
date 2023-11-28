import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import leetcode.P451;

public class P451Test {
    @Test
    void testSortCharactersByFrequency1() {
        String s = "tree";
        String result = P451.frequencySort(s);
        assertTrue(result.equals("eert") || result.equals("eetr"));
    }

    @Test
    void testSortCharactersByFrequency2() {
        String s = "cccaaa";
        String result = P451.frequencySort(s);
        assertTrue(result.equals("aaaccc") || result.equals("cccaaa"));
    }

    @Test
    void testSortCharactersByFrequency3() {
        String s = "Aabb";
        String result = P451.frequencySort(s);
        assertTrue(result.equals("bbAa") || result.equals("bbaA"));
    }

    @Test
    void testSortCharactersByFrequencyWithEmptyString() {
        String s = "";
        String result = P451.frequencySort(s);
        assertEquals("", result);
    }

    @Test
    void testSortCharactersByFrequencyWithSingleCharacter() {
        String s = "a";
        String result = P451.frequencySort(s);
        assertEquals("a", result);
    }

    @Test
    void testSortCharactersByFrequencyWithSameFrequency() {
        String s = "abcabc";
        String result = P451.frequencySort(s);
        assertTrue(result.equals("aabbcc") || result.equals("bbaacc") || result.equals("ccaabb"));
    }

    @Test
    void testSortCharactersByFrequencyWithDifferentFrequency() {
        String s = "aaabbbccc";
        String result = P451.frequencySort(s);
        assertTrue(result.equals("aaabbbccc") || result.equals("bbbaaaccc") || result.equals("cccaaabbb"));
    }
}
