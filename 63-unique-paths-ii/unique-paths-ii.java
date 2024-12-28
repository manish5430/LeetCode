class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        if(obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1) return 0;

        int[][] dp = new int[m][n];
        return recursion(obstacleGrid, dp);

    }

    static int recursion(int[][] obstacleGrid, int[][] dp){
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        for(int i = 0; i< m; i++){
            for(int j = 0; j< n; j++){

                if(obstacleGrid[i][j] == 1) dp[i][j] = 0;
                else if(i == 0 && j == 0) dp[i][j] = 1;
                else{
                    int down = 0, right = 0;
                    if(i > 0) down = dp[i-1][j];
                    if(j > 0) right = dp[i][j-1];

                    dp[i][j] = down + right;
                }
            }
        }
        return dp[m-1][n-1];
    }
}