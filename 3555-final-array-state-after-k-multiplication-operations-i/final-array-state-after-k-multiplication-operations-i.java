class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int count = 0;

        while(count < k  ){
            int min = 0;

            for(int i = 1; i< nums.length; i++){
                if(nums[i] < nums[min]){
                    min = i;    // here we are focusing on index
                }
            }
            nums[min] = nums[min] * multiplier;

            count++;
        }    
        return nums;    
    }
}