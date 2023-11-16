import leetcode.P3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class P3Test {
    @Test
    public void testLengthOfLongestSubstring1() {
        assertEquals(3, P3.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void testLengthOfLongestSubstring2() {
        assertEquals(1, P3.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void testLengthOfLongestSubstring3() {
        assertEquals(3, P3.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void testLengthOfLongestSubstring4() {
        assertEquals(0, P3.lengthOfLongestSubstring(""));
    }

    @Test
    public void testLengthOfLongestSubstring5() {
        assertEquals(1, P3.lengthOfLongestSubstring(" "));
    }

    @Test
    public void testLengthOfLongestSubstring6() {
        assertEquals(2, P3.lengthOfLongestSubstring("au"));
    }

    @Test
    public void testLengthOfLongestSubstring7() {
        assertEquals(2, P3.lengthOfLongestSubstring("aab"));
    }

    @Test
    public void testLengthOfLongestSubstring8() {
        assertEquals(3, P3.lengthOfLongestSubstring("dvdf"));
    }

    @Test
    public void testLengthOfLongestSubstring9() {
        assertEquals(5, P3.lengthOfLongestSubstring("anviaj"));
    }

    @Test
    public void testLengthOfLongestSubstring10() {
        assertEquals(6, P3.lengthOfLongestSubstring("wobgrovw"));
    }
}
