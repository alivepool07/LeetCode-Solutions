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
    public ListNode sortList(ListNode head) {
        
        if(head == null || head.next == null) return head;

        ListNode middle = findMiddle(head);

        //Dividing frim middle 

        ListNode right = middle.next;
        middle.next   =  null;
        ListNode left = head;


        left = sortList(left);
        right = sortList(right);

        return mergeList(left , right);
    }

    ListNode findMiddle (ListNode head) {
        
        if(head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    ListNode mergeList(ListNode left , ListNode right) {

        ListNode dn = new ListNode(-1);
        ListNode tmp = dn;

        while(left != null && right != null) {

            if(left.val <= right.val) {
                tmp.next = left;
                left = left.next;
            }
            else {
                tmp.next = right;
                right = right.next;
            }
            tmp = tmp.next;
        }
        if(left != null) {
            tmp.next = left;
        }
        else 
        {
            tmp .next = right;
        }
        return dn.next;
    }
    
}