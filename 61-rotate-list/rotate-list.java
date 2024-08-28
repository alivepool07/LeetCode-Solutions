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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0)  return head;

        ListNode temp = head;
        int cnt = 1;
        while (temp.next != null) {
            temp = temp.next;
            cnt++;
        }
        temp.next = head;
        k = k % cnt;
        int newEnd = cnt - k;

        while( newEnd != 0) {
            temp = temp.next;
            newEnd--;
        }
        head = temp.next;
        temp.next = null;

    return head;
    }
}