class Solution {
    public int findMin(int[] nums) {
        int minval = nums[0]; 

        for(int i=0; i<nums.length; i++){
            if(nums[i] < minval){
                minval = nums[i];
                return minval;
            }
        }
        return minval;
    }
}