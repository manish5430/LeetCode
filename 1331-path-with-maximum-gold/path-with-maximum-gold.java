class Solution {
    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];
        for(int[] rows : dp){
            Arrays.fill(rows, -1);
        }
        int max = 0;
        for(int i = 0; i< m; i++){
            for(int j = 0; j< n; j++){
                if(grid[i][j] != 0){
                    max = Math.max(max, recursion(grid, i, j, dp));
                }
            }
        }
        return max;
    }

    static int recursion(int[][] grid, int i, int j, int[][] dp){
        int m = grid.length;
        int n = grid[0].length;
        

        if(i < 0 || j< 0 || i>= m || j>= n || grid[i][j] == 0) return 0;

        if(dp[i][j] != -1){
            return 0;
        }
        dp[i][j] = 0;
        int temp = grid[i][j];
        int max = 0;
        max = Math.max(
            (Math.max(recursion(grid, i-1, j, dp), recursion(grid, i+1, j, dp))),
            (Math.max(recursion(grid, i, j-1, dp), recursion(grid, i, j+1, dp)))
        );

        dp[i][j] = -1;
        return temp + max;        

    }
}