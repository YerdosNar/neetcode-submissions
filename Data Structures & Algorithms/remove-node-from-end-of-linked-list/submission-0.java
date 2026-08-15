/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l1 = head;
        while (n > 0) {
            l1 = l1.next;
            n--;
        }

        ListNode dum = new ListNode(0, head);
        ListNode l2 = dum;
        while (l1 != null) {
            l2 = l2.next;
            l1 = l1.next;
        }
        l2.next = l2.next.next;
        return dum.next;
    }
}
