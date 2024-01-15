import org.junit.jupiter.api.Test;
import leetcode.P1704;

import static org.junit.jupiter.api.Assertions.*;

class P1704Test {
    @Test
    public void testEqualNumberOfVowels() {
        assertTrue(P1704.halvesAreAlike("book"));
    }

    @Test
    public void testDifferentNumberOfVowels() {
        assertFalse(P1704.halvesAreAlike("text"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(P1704.halvesAreAlike(""));
    }

    @Test
    public void testSingleCharacterString() {
        assertTrue(P1704.halvesAreAlike("I"));
    }

    @Test
    public void testAllVowelsString() {
        assertTrue(P1704.halvesAreAlike("aeiouAEIOU"));
    }

    @Test
    public void testNoVowelsString() {
        assertTrue(P1704.halvesAreAlike("bcdfg"));
    }

    @Test
    public void testUpperCaseString() {
        assertTrue(P1704.halvesAreAlike("ABCDabcd"));
    }

    @Test
    public void testMixedCaseString() {
        assertTrue(P1704.halvesAreAlike("AbCdEfGh"));
    }

    @Test
    public void testStringWithSpaces() {
        assertTrue(P1704.halvesAreAlike("a b c d e f"));
    }
}