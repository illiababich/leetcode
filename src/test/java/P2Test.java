import org.junit.jupiter.api.Test;
import leetcode.P2;
import leetcode.P2.ListNode;

import static org.junit.jupiter.api.Assertions.*;

public class P2Test {

    @Test
    void testAddTwoNumbers() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result = P2.addTwoNumbers(l1, l2);
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
    }

    @Test
    void testAddTwoNumbersWithCarry() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode l2 = new ListNode(1);
        ListNode result = P2.addTwoNumbers(l1, l2);
        assertEquals(0, result.val);
        assertEquals(0, result.next.val);
        assertEquals(0, result.next.next.val);
        assertEquals(1, result.next.next.next.val);
    }

    @Test
    void testAddTwoNumbersWithDifferentLengths() {
        ListNode l1 = new ListNode(9, new ListNode(9));
        ListNode l2 = new ListNode(1);
        ListNode result = P2.addTwoNumbers(l1, l2);
        assertEquals(0, result.val);
        assertEquals(0, result.next.val);
        assertEquals(1, result.next.next.val);
    }

    @Test
    void testAddTwoNumbersWithZeros() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode result = P2.addTwoNumbers(l1, l2);
        assertEquals(0, result.val);
    }

    @Test
    void testAddTwoNumbersWithSingleDigit() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(9);
        ListNode result = P2.addTwoNumbers(l1, l2);
        assertEquals(0, result.val);
        assertEquals(1, result.next.val);
    }

    @Test
    void testAddTwoNumbersWithNoCarry() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode l2 = new ListNode(4, new ListNode(5, new ListNode(6)));
        ListNode result = P2.addTwoNumbers(l1, l2);
        assertEquals(5, result.val);
        assertEquals(7, result.next.val);
        assertEquals(9, result.next.next.val);
    }
}
