package leetcode;

public class P206 {
    public static class ListNode {
        public int val;
        public ListNode next;
        ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reversedListHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reversedListHead;
    }
}
