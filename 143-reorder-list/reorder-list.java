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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return;

        // finding middle element first 
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;   // new head for list2

        slow.next = null;   // detaching the lists

        // reversing the new list
        ListNode prev = null;
        ListNode curr = head2;
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        ListNode t1 = head;   // first one 
        ListNode t2 = prev;   // new one 
        while(t2 != null){
            ListNode m1 = t1.next;
            ListNode m2 = t2.next;
            t1.next = t2;   // t1 -> t2
            t2.next = m1;   // already stored t1.next as m1
            t1 = m1;    // updating original heads here 
            t2 = m2; 
        }

    }
}