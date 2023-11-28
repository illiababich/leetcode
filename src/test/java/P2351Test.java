import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import leetcode.P2351;

public class P2351Test {
    @Test
    void testFirstLetterToAppearTwice1() {
        String s = "abccbaacz";
        char result = P2351.repeatedCharacter(s);
        assertEquals('c', result);
    }

    @Test
    void testFirstLetterToAppearTwice2() {
        String s = "abcdd";
        char result = P2351.repeatedCharacter(s);
        assertEquals('d', result);
    }

    @Test
    void testFirstLetterToAppearTwiceWithNoDuplicates() {
        String s = "abc";
        char result = P2351.repeatedCharacter(s);
        assertEquals('\0', result);
    }

    @Test
    void testFirstLetterToAppearTwiceWithEmptyString() {
        String s = "";
        char result = P2351.repeatedCharacter(s);
        assertEquals('\0', result);
    }

    @Test
    void testFirstLetterToAppearTwiceWithSingleChar() {
        String s = "a";
        char result = P2351.repeatedCharacter(s);
        assertEquals('\0', result);
    }

    @Test
    void testFirstLetterToAppearTwiceWithSameChar() {
        String s = "zzzzzz";
        char result = P2351.repeatedCharacter(s);
        assertEquals('z', result);
    }

    @Test
    void testFirstLetterToAppearTwiceWithLargeInput() {
        String s = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        char result = P2351.repeatedCharacter(s);
        assertEquals('a', result);
    }
}
