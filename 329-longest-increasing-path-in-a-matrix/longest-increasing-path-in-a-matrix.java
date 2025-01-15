class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        for(int[] rows : dp){
            Arrays.fill(rows, -1);
        }

        int len = 0;
        for(int i = 0; i< m; i++){
            for(int j = 0; j< n; j++){
                len = Math.max(len, recursion(matrix, i, j, dp));
            }
        }
        return len;
    }

    static int recursion(int[][] matrix, int i, int j, int[][] dp){
        int m = matrix.length;
        int n = matrix[0].length;

        if(i< 0 || j< 0 || i>= m || j>= n) return 0;

        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int max = 0;
        if(i +1 < m && matrix[i+1][j] > matrix[i][j]){
            max = Math.max(max, recursion(matrix, i+1, j, dp));
        }
        if(i -1 >= 0 && matrix[i-1][j] > matrix[i][j]){
            max = Math.max(max, recursion(matrix, i-1, j, dp));
        }
        if(j +1 < n && matrix[i][j+1] > matrix[i][j]){
            max = Math.max(max, recursion(matrix, i, j+1, dp));
        }
        if(j -1 >= 0 && matrix[i][j -1] > matrix[i][j]){
            max = Math.max(max, recursion(matrix, i, j-1, dp));
        }

        return dp[i][j] = 1 + max;

    }
}