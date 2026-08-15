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
        ListNode ret = new ListNode();
        ListNode res = ret;
        boolean carry = false;

        while (l1 != null && l2 != null) {
            int digit = l1.val + l2.val;
            if (carry) digit++;
            if (digit >= 10) {
                digit -= 10;
                carry = true;
            } else {
                carry = false;
            }
            res.next = new ListNode(digit);
            res = res.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int digit = l1.val;
            if (carry) digit++;
            if (digit >= 10) {
                digit -= 10;
                carry = true;
            }
            else {
                carry = false;
            }
            res.next = new ListNode(digit);
            res = res.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int digit = l2.val;
            if (carry) digit++;
            if (digit >= 10) {
                digit -= 10;
                carry = true;
            }
            else {
                carry = false;
            }
            res.next = new ListNode(digit);
            res = res.next;
            l2 = l2.next;
        }

        if (carry) {
            res.next = new ListNode(1);
        }
        return ret.next;
    }
}
