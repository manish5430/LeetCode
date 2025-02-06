class Solution {
    public int superEggDrop(int e, int f) {
        int[][] dp = new int[e+1][f+1];
        for(int[] row : dp) Arrays.fill(row, -1);

        return recursion(e, f, dp);        
    }

    static int recursion(int e, int f, int[][] dp){
        if(f == 0 || f == 1) return f;
        if(e == 1) return f;

        if(dp[e][f] != -1) return dp[e][f];

        int min = Integer.MAX_VALUE;
        int i = 1;
        int j = f;
        while(i <= j){
            int mid=(i + j)/2;
            int left = recursion(e-1, mid-1, dp);
            int right = recursion(e, f-mid, dp);

            int temp = 1 + Math.max(left, right);

            if(left< right)   i = mid +1;
            else   j = mid -1;
    
            min = Math.min(min, temp);
        }
        dp[e][f] = min;
        return min;
    }
}