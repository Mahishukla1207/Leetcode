package LinkedList;

public class Removenthnode {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return val + (next == null ? "" : " -> " + next);
        }
    }

    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0, head);
            ListNode slow = dummy;
            ListNode fast = dummy;

            for (int i = 0; i < n; i++) {
                if (fast.next == null) {
                    return head; // invalid n, return original list
                }
                fast = fast.next;
            }

            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }

            if (slow.next != null) {
                slow.next = slow.next.next;
            }
            return dummy.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int n = 2;

        Solution solution = new Solution();
        ListNode result = solution.removeNthFromEnd(head, n);
        System.out.println("Result: " + result);
    }
}
