class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        // creating an ans 2d array containing the arrays of {i, j}, {i, J}, {i, j};
        int[][] ans = new int[rows * cols][2];

        // filling the coordinates with the rows and cols indices 
        int x = 0;
        for(int i = 0; i< rows; i++){
            for(int j = 0; j< cols; j++){
                ans[x][0] = i;
                ans[x][1] = j;
                x++;
            }
        }

        Arrays.sort(ans, (a,b) -> {
            int d1 = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int d2 = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return d1 -d2;
        });

        return ans;
    }
}