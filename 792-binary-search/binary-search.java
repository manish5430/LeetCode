class Solution {
    public int search(int[] nums, int target) {
        return search1(nums, target, 0, nums.length-1);
        
    }
    static int search1(int[] nums, int target, int s , int e){
        
        if( s > e)  return -1;

        int mid = s + (e -s) /2;
        if(nums[mid] == target)  return mid;
        if(target < nums[mid])  return search1(nums, target, s, mid-1);
        return search1(nums, target, mid+1, e);
    }
}