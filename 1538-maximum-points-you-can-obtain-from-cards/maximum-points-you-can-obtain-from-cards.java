class Solution {
    public int maxScore(int[] nums, int k) {
        int n = nums.length;
        int totalSum = 0;
        int leftSum = 0;
        int max = 0;
 
        // for initial window taking sum of all k elements from rightmost side
        for(int i = n-k; i< n; i++){      // n-k th the first index for totalSum
            totalSum += nums[i];
        }

        max = totalSum;   // damn important 

        for(int i = 0; i< k; i++){
            leftSum += nums[i];

            totalSum = totalSum - nums[n-k+i];   // subtract n-k+i th index number 

            max = Math.max(max, totalSum + leftSum);            
        }

        return max;
    }
}