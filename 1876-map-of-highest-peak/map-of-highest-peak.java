class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int[][] dir = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        int m = isWater.length;
        int n = isWater[0].length;
        int[][] result = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();    // to store r c 

        for(int i = 0; i< m; i++){
            for(int j = 0; j< n; j++){
                if(isWater[i][j] == 1){
                    result[i][j] = 0;
                    queue.offer(new int[] {i, j});
                }else{
                    result[i][j] = -1;
                }

            }
        }

        while(!queue.isEmpty()){
            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];
            int height = result[row][col];

            for(int i = 0; i< 4; i++){
                int row1 = row + dir[i][0];
                int col1 = col + dir[i][1];

                if(row1 >= 0 && row1 < m && col1 >= 0 && col1 < n && result[row1][col1] == -1){
                    result[row1][col1] = height +1;
                    queue.offer(new int[]{row1, col1});
                }
            }
        }
        
        return result;
    }
}