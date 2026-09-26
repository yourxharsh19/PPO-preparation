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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode current = dummy;
        int count = 0;
        for (int i = 0; i < left - 1; i++) {
            current = current.next;
        }
        ListNode prev = current;
        ListNode curr = prev.next;
        ListNode tail = curr;
        ListNode revprev = null;
        int c = 0;
        while (c < right - left + 1) {
            ListNode nextTemp = curr.next;
            curr.next = revprev;
            revprev = curr;
            curr = nextTemp;
            c++;
        }
        prev.next = revprev;
        tail.next = curr;
        return dummy.next;
    }
}