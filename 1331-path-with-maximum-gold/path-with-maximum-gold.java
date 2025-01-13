class Solution {
    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int max = 0;

        for(int i = 0; i< m; i++){
            for(int j = 0; j< n; j++){
                if(grid[i][j] != 0){
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }
        return max;
    }

    static int dfs(int[][] grid, int i, int j){
        int m = grid.length;
        int n = grid[0].length;

        if(i< 0 || i>= m || j< 0 || j >= n || grid[i][j] == 0) return 0;

        int temp = grid[i][j];
        grid[i][j] = 0;  // marked visited 

        int max = 0;
        max = Math.max( 
            Math.max(dfs(grid, i-1, j), dfs(grid, i+1, j)),
            Math.max(dfs(grid, i, j-1), dfs(grid, i, j+1))
        );

        grid[i][j] = temp;  // backtracking 

        return temp + max;
    }
}