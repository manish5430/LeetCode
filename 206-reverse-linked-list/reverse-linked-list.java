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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){   // bas curr head to forward move kra rhe hai 
            ListNode nextNode = curr.next;   // jus changing the signs here 
            curr.next = prev;   // we are not changing any values just the signs 
            prev = curr;    // curr.next is itself not the next no. we have to define 
            curr = nextNode;   // which no. is it and that will define its direction too
        } 
        return prev;        
    }
}