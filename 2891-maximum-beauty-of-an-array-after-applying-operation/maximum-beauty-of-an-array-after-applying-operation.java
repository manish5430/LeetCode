class Solution {
    public int maximumBeauty(int[] nums, int k) {
        if(nums.length == 1) return 1;

        int max = 0;
        for(int num : nums){
            max = Math.max(max, num);
        }

        // creating count array of max +1 size  from 0-max
        // num -k par count++ 
        // num +k +1 par count-- 
        // we will keep adding prefix sum and get the maxSum 
        int[] count = new int[max+1];
        
        // here we are incremented only in the range of count array 
        // that is from 0 to max  if it goes beyond that ++ -- the extreme element
        for(int num : nums){
            count[Math.max(num -k, 0)]++;
            count[Math.min(num +k +1, max)]--;
        }

        // get the maxSum form prefix sum in count array 
        int sum = 0;
        int maxSum = 0;
        for(int num : count){
            sum += num;
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }
}