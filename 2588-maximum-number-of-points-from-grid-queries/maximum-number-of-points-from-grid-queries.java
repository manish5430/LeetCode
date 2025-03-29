class Solution {    
    public static int[][] direction = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int[] maxPoints(int[][] grid, int[] queries) {
        int m = grid.length;
        int n = grid[0].length;
        int Q = queries.length;
        int[] result = new int[Q];

        int[][] sorted = new int[Q][2];
        for(int i = 0; i< Q; i++){
            sorted[i][0] = queries[i];    // queries array value 
            sorted[i][1] = i;             // and its index
        }

        Arrays.sort(sorted, (a, b) -> a[0] - b[0]);  // sort them based on the query value

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        pq.offer(new int[]{grid[0][0], 0, 0});

        boolean[][] visited = new boolean[m][n];
        visited[0][0] = true;

        int points = 0;

        for(int i = 0; i< Q; i++){
            int val = sorted[i][0];
            int index = sorted[i][1];

            while(! pq.isEmpty() && pq.peek()[0] < val){
                int[] arr = pq.poll();
                int x = arr[1]; int y = arr[2];

                points++;

                for(int[] dir : direction){
                    int i2 = x + dir[0];
                    int j2 = y + dir[1];

                    if(i2 >= 0 && i2 < m && j2 >= 0 && j2 < n && !visited[i2][j2]){
                        pq.offer(new int[]{grid[i2][j2], i2, j2});
                        visited[i2][j2] = true;
                    }
                }
            }
            
            result[index] = points;
        }
        
        return result;        
    }
}