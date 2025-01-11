class Solution {
    public int numSquares(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i*i <= n; i++){
            list.add(i *i);
        }
        int[] nums = list.stream().mapToInt(Integer :: intValue).toArray();
        int len = nums.length;
        int[][] dp = new int[len][n+1];
        
        for(int[] rows : dp){
            Arrays.fill(rows, -1);
        }

        int ans = recursion(nums, len-1, n, dp);
        if(ans >= Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }

    static int recursion(int[] nums, int i, int target, int[][] dp){
        if(target == 0) return 0;

    if(i == 0){
        if(nums[0] > 0 && target % nums[0] == 0){
            return target / nums[0];
        }else{
            return Integer.MAX_VALUE;
        }
    }

    if(dp[i][target] != -1){
        return dp[i][target];
    }

    int notake = 0 + recursion(nums, i-1, target, dp);
    int take = Integer.MAX_VALUE;
    if(nums[i] <= target){
        take = 1 + recursion(nums, i, target -nums[i], dp);
    }

    return dp[i][target] = Math.min(take, notake);
    }
}