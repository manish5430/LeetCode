class Solution {
    public int coinChange(int[] nums, int amount) {
        int n = nums.length;
        int target = amount;
        int[][] dp = new int[n+1][target +1];
        for(int[] num : dp){
            Arrays.fill(num, -1);
        }

        int ans = recursion(nums, n-1, target, dp);
        if(ans >= (int)Math.pow(10, 9)) return -1;
        return ans;
    }

    static int recursion(int[] nums, int i, int target, int[][] dp){
        if(i == 0){
            if(target % nums[0] == 0) return target/ nums[0];  
            else return (int)Math.pow(10, 9);
        }

        if(dp[i][target] != -1) return dp[i][target];

        int notake = 0 + recursion(nums, i-1, target, dp);
        int take = (int)Math.pow(10, 9);
        if(nums[i] <= target){
            take = 1 + recursion(nums, i, target -nums[i], dp);
        }

        return dp[i][target] = Math.min(take, notake); 
    }
}