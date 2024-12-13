class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][2];

        for(int i = 0; i< n; i++){
            dp[i][0] = nums[i];
            dp[i][1] = i;
        }

        Arrays.sort(dp, (a,b) -> a[0] -b[0]);

        boolean[] mark = new boolean[n];
        long ans = 0;
        
        for(int[] arr : dp){
            int val = arr[0];
            int val2 = arr[1];

            if( !mark[val2]){
                ans += val;

                mark[val2] = true;
                if(val2 > 0){
                    mark[val2-1] = true;
                }
                if(val2 < n-1){
                    mark[val2 +1] = true;
                }
            }
        }
        return ans;
        
    }
}