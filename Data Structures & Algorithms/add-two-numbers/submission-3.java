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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode cur = res;
        boolean carry = false;
        while (l1 != null || l2 != null || carry) {
            int n1 = (l1 != null) ? l1.val : 0;
            int n2 = (l2 != null) ? l2.val : 0;

            int val = n1 + n2;
            if (carry) val++;
            if (val > 9) {
                carry = true;
                val -= 10;
            } else {
                carry = false;
            }
            cur.next = new ListNode(val);
            cur = cur.next;
            l1 = (l1 != null) ? l1.next: null;
            l2 = (l2 != null) ? l2.next: null;
        }
        return res.next;
    }
}
