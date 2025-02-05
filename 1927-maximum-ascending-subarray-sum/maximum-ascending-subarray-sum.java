class Solution {
    public int maxAscendingSum(int[] nums) {
        if(nums.length == 1) return nums[0];
        
        int sum = 0;

        for(int i = 0; i< nums.length-1; i++){
            int count = nums[i];

            while (i < nums.length - 1 && nums[i] < nums[i + 1]) { 
                count += nums[i+1]; 
                i++; 
            }
            
            sum = Math.max(sum, count);
        }
        return sum;
    }
}