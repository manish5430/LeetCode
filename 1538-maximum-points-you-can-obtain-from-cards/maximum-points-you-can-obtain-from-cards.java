class Solution {
    public int maxScore(int[] nums, int k) {
        int n = nums.length;
        int totalSum = 0;
        int leftSum = 0;
        int max = 0;

        for(int i = n-k; i< n; i++){
            totalSum += nums[i];
        }
        max = totalSum;

        for(int i = 0; i< k; i++){
            leftSum += nums[i];

            totalSum = totalSum - nums[n-k+i];

            max = Math.max(max, totalSum + leftSum);
        }
        return max;
    }
}