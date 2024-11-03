class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int m = mat.length-1;

        for(int i = 0; i<= m; i++){
            // its a square matrix
            sum += mat[i][i];
            sum += mat[i][m-i]; 
        }

        if((m+1)%2 != 0){
            sum = sum - mat[(m+1)/2][(m+1)/2];
        }
        return sum;
    }
}