class Solution {
    public int coinChange(int[] nums, int amount) {
        int n = nums.length;
        int sum = amount;
        int[][] dp = new int[n+1][sum +1];
        for(int j = 0; j< sum+1; j++){
            dp[0][j] = Integer.MAX_VALUE -1;
        }
        for(int i = 1; i< n+1; i++){
            dp[i][0] = 0;            
        }


        for(int i = 1; i< n+1; i++){
            for(int j = 1; j< sum+1; j++){
                if(nums[i-1] <= j){
                    dp[i][j] = Math.min(1 + dp[i][j - nums[i-1]], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        if(dp[n][sum] == Integer.MAX_VALUE -1){
            return -1;
        }
        return dp[n][sum];        
    }
}