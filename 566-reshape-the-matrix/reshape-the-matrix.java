class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;

        if((row * col) != ( r * c)){
            return mat;
        }

        int[][] ans = new int[r][c];
        int ans_row = 0;
        int ans_col = 0;

        for(int i =0; i< row; i++){
            for(int j=0; j< col; j++){
                ans[ans_row][ans_col] = mat[i][j];
                ans_col++;

                if( ans_col ==c){
                    ans_col = 0; 
                    ans_row++;
                }
            }
        }
        return ans;
    }
}