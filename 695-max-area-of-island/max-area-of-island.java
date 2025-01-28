class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int ans = 0;
        for(int i = 0; i< n; i++){
            for(int j = 0; j< m; j++){
                if(grid[i][j] != 0){
                    ans = Math.max(ans, dfs(grid, i, j));
                }
            }
        }
        return ans;
        
    }

    static int dfs(int[][] grid, int i, int j){
        int n = grid.length;
        int m = grid[0].length;

        if(i< 0 || i>= n || j< 0 || j>= m || grid[i][j] == 0) return 0;

        int ans = grid[i][j];
        grid[i][j] = 0;

        ans += dfs(grid, i+1, j) + dfs(grid, i-1, j) + dfs(grid, i, j+1) + dfs(grid, i, j-1);

        return ans;
    }
}