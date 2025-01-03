class Solution {
    public int search(int[] nums, int target) {
        return recursion(nums, target, 0, nums.length-1);
        
    }

    static int recursion(int[] nums, int target, int s, int e){
        if(s > e) return -1;

        int mid = s + (e-s)/2;
        if(nums[mid] == target)  return mid;
        if(nums[mid] > target) return recursion(nums, target, s, mid-1);
        return recursion(nums, target, mid+1, e);
    }
}