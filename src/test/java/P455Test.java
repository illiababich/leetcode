import org.junit.jupiter.api.Test;

import static leetcode.P455.findContentChildren;
import static org.junit.jupiter.api.Assertions.*;

class P455Test {
    @Test
    public void testBasicCase() {
        assertEquals(1, findContentChildren(new int[]{1,2,3}, new int[]{1,1}));
    }

    @Test
    public void testNoCookies() {
        assertEquals(0, findContentChildren(new int[]{}, new int[]{1,2,3}));
    }

    @Test
    public void testNoChildren() {
        assertEquals(0, findContentChildren(new int[]{1,2,3}, new int[]{}));
    }

    @Test
    public void testAllChildrenContented() {
        assertEquals(3, findContentChildren(new int[]{1,2,3}, new int[]{1,2,3}));
    }

    @Test
    public void testInsufficientCookies() {
        assertEquals(0, findContentChildren(new int[]{2,3,4}, new int[]{1,1,1}));
    }

    @Test
    public void testLargeNumbers() {
        assertEquals(2, findContentChildren(new int[]{10,9,8,7}, new int[]{5,6,7,8}));
    }

    @Test
    public void testDifferentLengths() {
        assertEquals(2, findContentChildren(new int[]{1,2}, new int[]{1,2,3}));
    }

    @Test
    public void testSameMinimumCookieSize() {
        assertEquals(2, findContentChildren(new int[]{3,3,3,3}, new int[]{3,3}));
    }

    @Test
    public void testUnsortedArrays() {
        assertEquals(1, findContentChildren(new int[]{2,3,1}, new int[]{1,1}));
    }

    @Test
    public void testSingleChildAndCookie() {
        assertEquals(1, findContentChildren(new int[]{1}, new int[]{2}));
    }
}