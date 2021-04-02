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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode revHead;
        if (fast.next == null) {
            revHead = reverse(slow);
        } else {
            revHead = reverse(slow.next);
        }
        slow.next = null;

        ListNode cur = head, revCur = revHead;
        while (cur != null && revCur != null) {
            if (cur.val != revCur.val) {
                return false;
            }
            cur = cur.next;
            revCur = revCur.next;
        }

        if (cur == null && revCur == null) {
            return true;
        } else {
            return false;
        }

    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null, cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
}