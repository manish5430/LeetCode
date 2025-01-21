class Solution {
    public long gridGame(int[][] grid) {
        long topSum = 0;
        long n = grid[0].length;
        for(int i = 0; i< n; i++){
            topSum += grid[0][i];
        }
        long bottomSum = 0;
        long ans = Long.MAX_VALUE;
        for(int i = 0; i< n; i++){
            topSum -= grid[0][i];

            ans = Math.min(ans, Math.max(topSum, bottomSum));

            bottomSum += grid[1][i];
        }
        return ans;
    }
}