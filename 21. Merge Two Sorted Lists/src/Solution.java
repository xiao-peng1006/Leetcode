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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        ListNode head = new ListNode(-1), cur = head;
        ListNode l1Cur = l1, l2Cur = l2;
        while (l1Cur != null && l2Cur != null) {
            if (l1Cur.val < l2Cur.val) {
                cur.next = l1Cur;
                l1Cur = l1Cur.next;
            } else {
                cur.next = l2Cur;
                l2Cur = l2Cur.next;
            }
            cur = cur.next;
        }

        while (l1Cur != null) {
            cur.next = l1Cur;
            l1Cur = l1Cur.next;
            cur = cur.next;
        }

        while (l2Cur != null) {
            cur.next = l2Cur;
            l2Cur = l2Cur.next;
            cur = cur.next;
        }

        return head.next;
    }
}