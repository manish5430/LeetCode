class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] rowCount = new int[m];
        int[] colCount = new int[n];

        HashMap<Integer, int[]> map = new HashMap<>();
        for(int i = 0; i< m; i++){
            for(int j = 0; j< n; j++){
                map.put(mat[i][j], new int[] {i, j});
            }
        }

        int len = m * n;
        for(int i = 0; i< len; i++){
            int[] cell = map.get(arr[i]);
            rowCount[cell[0]]++;
            colCount[cell[1]]++;

            if(rowCount[cell[0]] == n || colCount[cell[1]] == m){
                return i;
            }
        }
        return -1;
    }
}