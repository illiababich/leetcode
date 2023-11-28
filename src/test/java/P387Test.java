import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import leetcode.P387;

public class P387Test {
    @Test
    void testFirstUniqChar1() {
        String s = "leetcode";
        int result = P387.firstUniqChar(s);
        assertEquals(0, result);
    }

    @Test
    void testFirstUniqChar2() {
        String s = "loveleetcode";
        int result = P387.firstUniqChar(s);
        assertEquals(2, result);
    }

    @Test
    void testFirstUniqCharWithNoUniqueChars() {
        String s = "aabb";
        int result = P387.firstUniqChar(s);
        assertEquals(-1, result);
    }

    @Test
    void testFirstUniqCharWithEmptyString() {
        String s = "";
        int result = P387.firstUniqChar(s);
        assertEquals(-1, result);
    }

    @Test
    void testFirstUniqCharWithSingleChar() {
        String s = "z";
        int result = P387.firstUniqChar(s);
        assertEquals(0, result);
    }

    @Test
    void testFirstUniqCharWithSameChar() {
        String s = "zzzzzz";
        int result = P387.firstUniqChar(s);
        assertEquals(-1, result);
    }

    @Test
    void testFirstUniqCharWithLargeInput() {
        String s = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        int result = P387.firstUniqChar(s);
        assertEquals(-1, result);
    }
}
