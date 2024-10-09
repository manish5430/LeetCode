class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;

        if((row * col) != ( r * c)){
            return mat;
        }

        int[][] ans = new int[r][c];
        int a = 0;
        int b = 0;

        for(int i =0; i< row; i++){
            for(int j=0; j< col; j++){
                ans[a][b] = mat[i][j];
                b++;

                if( b == c){
                    b = 0; 
                    a++;
                }
            }
        }
        return ans;
    }
}