class Solution {
    public int search(int[] nums, int target) {
        return rotated(nums, target, 0, nums.length-1);
        
    }

    static int rotated(int[] nums, int target, int s, int e){
        if(s > e)  return -1;
        int mid = s +(e-s)/2;

        if( nums[mid] == target) return mid;

        if(nums[s] <= nums[mid]){
            if(target >= nums[s] && target < nums[mid]){
                return rotated(nums, target, s, mid-1);
            }else{
                return rotated(nums, target, mid+1, e);
            }
        }

        if(target > nums[mid] && target<= nums[e]){
            return rotated(nums, target, mid+1, e);
        }

        return rotated(nums, target, s, mid-1);
    }
}