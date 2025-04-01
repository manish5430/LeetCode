class Solution {
    public long mostPoints(int[][] nums) {
        int n = nums.length;

        long[] dp = new long[n+1];
        Arrays.fill(dp, -1);
        
        return recursion(nums, 0, dp);        
    }

    static long recursion(int[][] nums, int i, long[] dp){

        if(i >= nums.length){
            return 0;
        }

        if(dp[i] != -1) return dp[i];

        long taken = nums[i][0] + recursion(nums, i+ nums[i][1] +1, dp);
        long notTaken = recursion(nums, i+1, dp);

        return dp[i] = Math.max(taken, notTaken);       

    }
}