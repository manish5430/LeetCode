class Solution {
    public int change(int target, int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][target +1];

        for(int[] rows : dp){
            Arrays.fill(rows, -1);
        }

        return recursion(nums, nums.length -1, target, dp);
        
    }

    static int recursion(int[] nums, int i, int target, int[][] dp){
        if(i == 0){
            if(target % nums[0] == 0){
                return 1;
            }else{
                return 0;
            }
        }

        if(dp[i][target] != -1){
            return dp[i][target];
        }

        int notake = recursion(nums, i-1, target, dp);
        int take = 0;
        if(nums[i] <= target){
            take = recursion(nums, i, target - nums[i], dp);
        }

        return dp[i][target] = notake + take;
    }
}