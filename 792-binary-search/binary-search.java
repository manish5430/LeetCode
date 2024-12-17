class Solution {
    public int search(int[] nums, int target) {
        return recursion(nums, target, 0, nums.length-1);
        
    }

    static int recursion(int[] nums, int target, int start, int end){

        while(start <= end ){
            int mid = start + (end-start)/2;

            if(target == nums[mid]){
                return mid;
            }
            else if(target > nums[mid]){
                return recursion(nums, target, mid +1, end);
            }
            else if(target < nums[mid]){
                return recursion(nums, target, start, mid-1);
            }
        }
        return -1;
    }
}