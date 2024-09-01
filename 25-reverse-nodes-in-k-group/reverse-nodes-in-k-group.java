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
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode tmp = head;
        ListNode prevLast = null;

        while (tmp != null ) {

            ListNode kNode = getkNode(tmp , k);

            if(kNode == null) {
                if(prevLast != null) prevLast.next = tmp;

                break;
            }

            ListNode nxtNode = kNode.next;

            revLL(tmp , k);

            if(tmp == head) head = kNode;
            else prevLast.next = kNode;


            prevLast = tmp;
            tmp = nxtNode;
        }
        return head;
        
    }
    static ListNode revLL(ListNode head,int k ) {
        ListNode tmp = head;
        ListNode prev = null;

        while (k > 0) {
            ListNode next = tmp.next;
            tmp.next = prev;
            prev = tmp;
            tmp = next;
            k--;
        }
        head.next = tmp;
        return prev;
    }

    static ListNode getkNode(ListNode tmp , int k) {
        k = k-1;

        while(tmp != null && k > 0) {
            tmp = tmp.next;
            k--;
        }
        return tmp;
    }
}