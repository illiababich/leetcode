import org.junit.jupiter.api.Test;
import leetcode.P206;
import leetcode.P206.ListNode;

import static org.junit.jupiter.api.Assertions.*;

public class P206Test {

    @Test
    public void testReverseListWithMultipleNodes() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));
        assertTrue(listsAreEqual(expected, P206.reverseList(head)));
    }

    @Test
    public void testReverseListWithTwoNodes() {
        ListNode head = new ListNode(1, new ListNode(2));
        ListNode expected = new ListNode(2, new ListNode(1));
        assertTrue(listsAreEqual(expected, P206.reverseList(head)));
    }

    @Test
    public void testReverseListWithSingleNode() {
        ListNode head = new ListNode(1);
        ListNode expected = new ListNode(1);
        assertTrue(listsAreEqual(expected, P206.reverseList(head)));
    }

    @Test
    public void testReverseListWithNoNodes() {
        ListNode head = null;
        ListNode expected = null;
        assertTrue(listsAreEqual(expected, P206.reverseList(head)));
    }

    private boolean listsAreEqual(ListNode head1, ListNode head2) {
        while (head1 != null && head2 != null) {
            if (head1.val != head2.val) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1 == null && head2 == null;
    }
}
