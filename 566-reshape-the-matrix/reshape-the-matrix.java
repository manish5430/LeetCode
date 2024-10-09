class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;

        if((row * col) != ( r * c)){
            return mat;
        }

        int[][] ans = new int[r][c];
        ArrayList<Integer> list = new ArrayList<>();
        for(int[] i : mat){
            for(int num : i){
                list.add(num);
            }
        }

        int a = 0;
        for(int i=0; i< r; i++){
            for(int j=0; j< c; j++){
                ans[i][j] = list.get(a);
                a++;
            }
        }
        return ans;
    }
}