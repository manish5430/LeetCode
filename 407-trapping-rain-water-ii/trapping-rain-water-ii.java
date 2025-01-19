class Solution {
    public int trapRainWater(int[][] heightMap) {
        int[][] dir = new int[][] { {0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        int rows = heightMap.length;
        int cols = heightMap[0].length;
        int falseCells = rows * cols;
        boolean[][] visited = new boolean[rows][cols];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] - b[0]));

        // filling borders in priority queue with true
        for(int i = 0; i< rows; i++){
            pq.offer(new int[] { heightMap[i][0], i, 0});
            pq.offer(new int[] { heightMap[i][cols-1], i, cols-1});
            visited[i][0] = true;
            visited[i][cols-1] = true;
            falseCells--;
            falseCells--;
        }

        for(int j = 1; j< cols-1; j++){
            pq.offer(new int[] { heightMap[0][j], 0, j});
            pq.offer(new int[] { heightMap[rows-1][j], rows-1, j});
            visited[0][j] = true;
            visited[rows-1][j] = true;
            falseCells--;
            falseCells--;
        }

        int level = 0;
        int ans = 0;

        while(!pq.isEmpty() && falseCells > 0){
            int cell[] = pq.poll();
            int height = cell[0];
            int row = cell[1];
            int col = cell[2];
            level = Math.max(level, height);

            for(int i = 0; i< dir.length; i++){
                int sideRow = row + dir[i][0];
                int sideCol = col + dir[i][1];

                if(isValid(sideRow, sideCol, rows, cols) && !visited[sideRow][sideCol]){
                    int sideHeight = heightMap[sideRow][sideCol];

                    if(sideHeight < level){
                        ans = ans + level - sideHeight;
                    }

                    pq.offer(new int[] { sideHeight, sideRow, sideCol});
                    visited[sideRow][sideCol] = true;
                    falseCells--;

                }
            }
        }
        return ans;
    }

    static boolean isValid(int row, int col, int rows, int cols){
        return row >= 0 && col >= 0 && row < rows && col < cols;
    }
}