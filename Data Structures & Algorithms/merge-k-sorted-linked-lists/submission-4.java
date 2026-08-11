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
    private ListNode mergeTwo(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode cur = res;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                cur.next = l2;
                l2 = l2.next;
            } else {
                cur.next = l1;
                l1 = l1.next;
            }
            cur = cur.next;
        }

        if (l1 != null) {
            cur.next = l1;
        }
        if (l2 != null) {
            cur.next = l2; 
        }

        return res.next;
    }

    //private void print(ListNode list) {
    //    while (list.next != null) {
    //        System.out.println(list.val);
    //        list = list.next;
    //    }
    //    System.out.println(list.val);
    //}

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;

        ListNode res = new ListNode();
        ListNode cur = res;
        for (int i = 0; i < lists.length-1; i++) {
            //print(lists[i]);
            //print(lists[i+1]);
            //System.out.println();
            lists[i+1] = mergeTwo(lists[i], lists[i+1]);
        }
        return lists[lists.length-1];
    }
}
