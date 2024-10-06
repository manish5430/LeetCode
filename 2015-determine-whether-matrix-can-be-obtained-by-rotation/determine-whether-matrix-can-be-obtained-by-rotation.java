class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        for(int i =0; i< 4; i++){
            if(checkEqual(mat, target)){
                return true;
            }
            rotateMat(mat);            
        }        
        return false;
    }

    static boolean checkEqual(int[][] mat, int[][] target){
    int n = mat.length;
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                if( mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    static void rotateMat(int[][] mat){
        int n = mat.length;
        for(int i=0; i< n; i++){
            for(int j=0; j< i; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        int start = 0;
        int end = n-1;

        while( start <= end){
            for(int i=0; i< n; i++){
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
            }
            start++;
            end--;
        }
    }

}