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
        
        int[] nums = new int[list.size()];
        int index = 0;
        for(int i : list){
            nums[index++] = i;        
        }

        for(int i= 0; i< nums.length-1; i++){
            for(int j = i+1; j>0; j--){
                if(nums[j] < nums[j-1]){
                    swap(nums, j, j-1);
                }
            }
        }

        list.clear();
        for(int i : nums){
            list.add(i);
        }

        num = head;
        for(int n : list){
            num.val = n;
            num = num.next;
        }
        
        return head;
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}