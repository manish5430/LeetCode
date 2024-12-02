class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int MinSum = nums[0] + nums[1] + nums[2];

        for(int i = 0; i< nums.length-2; i++){
            int j = i+1;
            int k = nums.length-1;
            
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target){
                    return target;
                }
                if(sum < target) j++;
                if(sum > target) k--;
                
                if((Math.abs(sum - target)) < (Math.abs(MinSum - target))){
                    MinSum = sum;
                }
            }
        }
        return MinSum; 
        
    }
}