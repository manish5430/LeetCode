class Solution {
    public int coinChange(int[] nums, int target) {
        int n = nums.length;
        int[][] dp = new int[n][target +1];

        for(int[] rows : dp){
            Arrays.fill(rows, -1);
        }
        
        int ans = recursion(nums, nums.length -1, target, dp);

        if(ans >= (int) Math.pow(10, 9)){
            return -1;
        }
        return ans;
        
    }

    static int recursion(int[] nums, int i, int target, int[][] dp){
        if(i == 0){
            if(target % nums[0] == 0){
                return target /nums[0];
            }else{
                return (int) Math.pow(10, 9);
            }
        }

        if(dp[i][target] != -1){
            return dp[i][target];
        }

        int notake = 0 + recursion(nums, i-1, target, dp);
        int take = (int) Math.pow(10, 9);
        if(nums[i] <= target){
            take =  1+ recursion(nums, i, target - nums[i], dp);
        }
        return dp[i][target] = Math.min(notake, take);
    }
}