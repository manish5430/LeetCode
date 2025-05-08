class Solution {
    static int[][] direction = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int minTimeToReach(int[][] moveTime) {
        int m = moveTime.length;
        int n = moveTime[0].length;

        int[][] result = new int[m][n];
        for(int[] row : result){
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        result[0][0] = 0;
        pq.offer(new int[]{0, 0, 0});

        while(! pq.isEmpty()){
            int[] nums = pq.poll();
            int time = nums[0];
            int i = nums[1];
            int j = nums[2];

            if(i == m-1 && j == n-1){
                return time;
            }

            for(int[] dir : direction){
                int i2 = i + dir[0];
                int j2 = j + dir[1];

                if(i2 >= 0 && i2 < m && j2 >= 0 && j2 < n){
                    int wait = Math.max(moveTime[i2][j2] - time, 0);
                    int arrTime = time + wait + 1;
                

                    if(result[i2][j2] > arrTime){
                        result[i2][j2] = arrTime;
                        pq.offer(new int[]{arrTime, i2, j2});
                    }
                }
            }
        }
        return -1;
    }
}