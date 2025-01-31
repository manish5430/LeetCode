class Solution {
    static int n;
    static int[][] direction = { {1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int largestIsland(int[][] grid) {
        HashMap<Integer, Integer> map = new HashMap<>();
        n = grid.length;
        int maxArea = 0;
        int uniqueId = 2;

        for(int i = 0; i<n; i++){
            for(int j = 0; j< n; j++){
                if(grid[i][j] == 1){
                    int size = dfs(grid, i, j, uniqueId);
                    maxArea = Math.max(size, maxArea);
                    map.put(uniqueId, size);   
                    uniqueId++;
                }
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(grid[i][j] == 0){
                    HashSet<Integer> set = new HashSet<>();

                    for(int[] dir : direction){
                        int x = i + dir[0];
                        int y = j + dir[1]; 
                        if(x >= 0 && x< n && y>= 0 && y< n && grid[x][y] != 0){
                            set.add(grid[x][y]);
                        }
                    }
                    int sum = 1;
                    for(int id : set){
                        sum += map.get(id);
                    }
                    maxArea = Math.max(maxArea, sum);
                }
            }
        }
        return maxArea;                 
    }

    static int dfs(int[][] grid, int i, int j, int id){
        if(i< 0 || i>=n || j< 0 || j>= n || grid[i][j] != 1) return 0;

        grid[i][j] = id;
        int count = 1;

        for(int[] dir : direction){
            int x = i + dir[0];
            int y = j + dir[1]; 
            count += dfs(grid, x, y, id);       
            
        }
        return count;
    }
}