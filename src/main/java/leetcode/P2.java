package leetcode;

public class P2 {
    public static class ListNode {
        public int val;
        public ListNode next;
        ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode iter = result;
        int carry = 0;

        while (l2 != null || l1 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;

            if (carry == 1) {
                carry = 0;
            }

            if (sum > 9) {
                carry = 1;
            }

            iter.next = new ListNode(sum % 10);
            iter = iter.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            iter.next = new ListNode(carry);
        }

        return result.next;
    }
}
