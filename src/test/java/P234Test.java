import leetcode.P234;
import org.junit.jupiter.api.Test;
import leetcode.P234.ListNode;

import static org.junit.jupiter.api.Assertions.*;

public class P234Test {

    @Test
    void testCase1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        assertFalse(P234.isPalindrome(head));
    }

    @Test
    void testCase2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        assertTrue(P234.isPalindrome(head));
    }

    @Test
    void testCase3() {
        ListNode head = new ListNode(1);
        assertTrue(P234.isPalindrome(head));
    }

    @Test
    void testCase4() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        assertTrue(P234.isPalindrome(head));
    }

    @Test
    void testCase5() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        assertFalse(P234.isPalindrome(head));
    }

    @Test
    void testCase6() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        assertTrue(P234.isPalindrome(head));
    }

    @Test
    void testCase7() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        assertTrue(P234.isPalindrome(head));
    }

    @Test
    void testCase8() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        assertFalse(P234.isPalindrome(head));
    }

    @Test
    void testCase9() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(2);
        assertFalse(P234.isPalindrome(head));
    }

    @Test
    void testCase10() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(1);
        assertTrue(P234.isPalindrome(head));
    }


}
