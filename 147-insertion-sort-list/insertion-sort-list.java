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
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        ListNode num = head;
        while(num != null){
            list.add(num.val);
            num = num.next;
        }
        
        Collections.sort(list);

        num = head;
        for(int n : list){
            num.val = n;
            num = num.next;
        }
        
        return head;
    }
}