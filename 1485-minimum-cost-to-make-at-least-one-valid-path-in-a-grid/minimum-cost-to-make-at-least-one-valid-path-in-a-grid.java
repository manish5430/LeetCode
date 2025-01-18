class Solution {
    int[][] dirx = new int[][] { {0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int minCost(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int[][] minCost = new int[rows][cols];
        for(int[] row : minCost){
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[] {0, 0, 0});
        minCost[0][0] = 0;

        while(! pq.isEmpty()){
            int[] arr = pq.poll();
            int cost = arr[0], row = arr[1], col = arr[2];

            if(minCost[row][col] < cost) continue;   // this cost is current one 

            for(int dir = 0; dir < 4; dir++){
                int nextRow = row + dirx[dir][0];
                int nextCol = col + dirx[dir][1];

                if(nextRow >= 0 && nextRow < rows && nextCol >= 0 && nextCol < cols){
                    int nextCellCost;

                    if(dir+1 == grid[row][col]){
                        nextCellCost = 0;
                    }else{
                        nextCellCost = 1;
                    }

                    int newCost = cost + nextCellCost;

                    if(newCost < minCost[nextRow][nextCol]){
                        minCost[nextRow][nextCol] = newCost;
                        pq.offer(new int[] {newCost, nextRow, nextCol});
                    }
                }
            }
        }
        return minCost[rows-1][cols -1];
    }
}