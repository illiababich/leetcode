import org.junit.jupiter.api.Test;
import leetcode.P2278;

import static org.junit.jupiter.api.Assertions.*;

public class P2278Test {
    @Test
    void testPercentageOfLetter1() {
        String s = "foobar";
        char letter = 'o';
        int result = P2278.percentageLetter(s, letter);
        assertEquals(33, result);
    }

    @Test
    void testPercentageOfLetter2() {
        String s = "jjjj";
        char letter = 'k';
        int result = P2278.percentageLetter(s, letter);
        assertEquals(0, result);
    }

    @Test
    void testPercentageOfLetterWithEmptyString() {
        String s = "";
        char letter = 'a';
        int result = P2278.percentageLetter(s, letter);
        assertEquals(0, result);
    }

    @Test
    void testPercentageOfLetterWithSingleChar() {
        String s = "a";
        char letter = 'a';
        int result = P2278.percentageLetter(s, letter);
        assertEquals(100, result);
    }

    @Test
    void testPercentageOfLetterWithSameChar() {
        String s = "zzzzzz";
        char letter = 'z';
        int result = P2278.percentageLetter(s, letter);
        assertEquals(100, result);
    }

    @Test
    void testPercentageOfLetterWithLargeInput() {
        String s = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        char letter = 'a';
        int result = P2278.percentageLetter(s, letter);
        assertEquals(4, result);
    }
}
