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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;

        ListNode res = new ListNode();
        ListNode dum = res;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                dum.next= list1;
                list1 = list1.next;
            }
            else {
                dum.next = list2;
                list2 = list2.next;
            }
            dum = dum.next;
        }
        if (list1 != null) {
            dum.next = list1;
        }
        else if (list2 != null) {
            dum.next = list2;
        }

        return res.next;
    }
}

