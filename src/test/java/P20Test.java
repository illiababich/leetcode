import org.junit.jupiter.api.Test;
import leetcode.P20;

import static org.junit.jupiter.api.Assertions.*;

public class P20Test {
    @Test
    void testValidParentheses1() {
        assertTrue(P20.isValid("()"));
    }

    @Test
    void testValidParentheses2() {
        assertTrue(P20.isValid("()[]{}"));
    }

    @Test
    void testValidParentheses3() {
        assertFalse(P20.isValid("(]"));
    }

    @Test
    void testValidParentheses4() {
        assertFalse(P20.isValid("([)]"));
    }

    @Test
    void testValidParentheses5() {
        assertTrue(P20.isValid("{[]}"));
    }

    @Test
    void testValidParentheses6() {
        assertFalse(P20.isValid("{"));
    }

    @Test
    void testValidParentheses7() {
        assertFalse(P20.isValid("}"));
    }

    @Test
    void testValidParentheses8() {
        assertFalse(P20.isValid("["));
    }

    @Test
    void testValidParentheses9() {
        assertFalse(P20.isValid("]"));
    }

    @Test
    void testValidParentheses10() {
        assertFalse(P20.isValid("("));
    }
}