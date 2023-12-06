import org.junit.jupiter.api.Test;
import leetcode.P125;

import static org.junit.jupiter.api.Assertions.*;

public class P125Test {
    @Test
    public void testEmptyString() {
        assertTrue(P125.isPalindrome(""), "An empty string should be considered a palindrome");
    }

    @Test
    public void testSingleCharacter() {
        assertTrue(P125.isPalindrome("a"), "A single character should be considered a palindrome");
    }

    @Test
    public void testValidPalindrome() {
        assertTrue(P125.isPalindrome("A man, a plan, a canal: Panama"), "This string is a valid palindrome");
    }

    @Test
    public void testInvalidPalindrome() {
        assertFalse(P125.isPalindrome("race a car"), "This string is not a valid palindrome");
    }

    @Test
    public void testStringWithSpecialCharacters() {
        assertTrue(P125.isPalindrome(".,!"), "A string with only special characters should be considered a palindrome");
    }

    @Test
    public void testStringWithMixedCase() {
        assertTrue(P125.isPalindrome("RaceCar"), "Palindrome check should be case-insensitive");
    }

    @Test
    public void testStringWithNumbers() {
        assertTrue(P125.isPalindrome("12321"), "A numeric palindrome should be valid");
        assertFalse(P125.isPalindrome("12345"), "This numeric string is not a palindrome");
    }

    @Test
    public void testNullInput() {
        assertThrows(NullPointerException.class, () -> P125.isPalindrome(null), "Null input should throw NullPointerException");
    }
}
