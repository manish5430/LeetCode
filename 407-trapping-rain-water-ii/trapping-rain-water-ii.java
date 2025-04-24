class Solution {
    public int trapRainWater(int[][] heightMap) {
        int[][] direction = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        int rows = heightMap.length;
        int cols = heightMap[0].length;

        if(rows < 3 || cols < 3) return 0;
        int leftCells = rows* cols;
        boolean[][] visited = new boolean[rows][cols];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] - b[0]));

        for(int i = 0; i< rows; i++){
            pq.offer(new int[]{heightMap[i][0], i, 0});
            pq.offer(new int[]{heightMap[i][cols -1], i, cols-1});
            visited[i][0] = true;
            visited[i][cols-1] = true;
            leftCells--;
            leftCells--;
        }

        for(int i = 1; i< cols-1; i++){
            pq.offer(new int[]{heightMap[0][i], 0, i});
            pq.offer(new int[]{heightMap[rows-1][i], rows -1, i});
            visited[0][i] = true;
            visited[rows -1][i] = true;
            leftCells--;
            leftCells--;
        }

        int trappedWater = 0;
        int waterLevel = 0;

        while(!pq.isEmpty() && leftCells > 0){
            int[] cell = pq.poll();
            int height = cell[0];
            int row = cell[1];
            int col = cell[2];

            waterLevel = Math.max(waterLevel, height);

            for(int[] dir : direction){
                int row2 = row + dir[0];
                int col2 = col + dir[1];
                // int height2 = heightMap[row2][col2];     we can not define it here not without verifying if row2 col2 are valid or not 

                if(isValid(row2, col2, rows, cols) && !visited[row2][col2]){
                    int height2 = heightMap[row2][col2];
                    if(height2 < waterLevel){
                        trappedWater += waterLevel - height2;
                    }

                    pq.offer(new int[]{height2, row2, col2});
                    visited[row2][col2] = true;
                    leftCells--;  
                }  
            }
        }
        return trappedWater;
    }

    static boolean isValid(int row, int col, int rows, int cols){
        return row >= 0 && col >= 0 && row < rows && col < cols;
    }
}