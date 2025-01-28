class Solution {
    public int mergeStones(int[] nums, int k) {
        int n = nums.length;
        int[][] dp = new int[n+1][n+1];
        int[] prefixSum = new int[n+1];

        for(int i = 0; i< n; i++){
            prefixSum[i+1] = prefixSum[i] + nums[i];
        }

        if((n-1) %(k-1) != 0) return -1; 

        for(int len = k; len<= n; len++){   // its not index its the length of merging 
            for(int i = 0; i<= n -len; i++){
                int j = i + len -1;

                dp[i][j] = Integer.MAX_VALUE;

                for(int m = i; m< j; m +=k-1){
                    dp[i][j] = Math.min(dp[i][m] + dp[m+1][j], dp[i][j]);
                }

                if((j-i) %(k-1) == 0){
                    dp[i][j] += prefixSum[j+1] - prefixSum[i];
                }
            }
        }

        return dp[0][n-1];   

        
    }
}