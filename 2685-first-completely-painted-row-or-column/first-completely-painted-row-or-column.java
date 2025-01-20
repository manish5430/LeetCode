class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer, int[]> map = new HashMap<>();
        int m = mat.length;
        int n = mat[0].length;

        for(int i = 0; i< m; i++){
            for(int j = 0; j< n; j++){
                map.put(mat[i][j], new int[]{i, j});
            }
        }

        int len = m * n;  // length of array 
        int[] freq1 = new int[m];
        int[] freq2 = new int[n];
        for(int i = 0; i< len; i++){
            int[] cell = map.get(arr[i]);
            freq1[cell[0]]++;
            freq2[cell[1]]++;

            if(freq1[cell[0]] == n || freq2[cell[1]] == m){
                return i;
            }            
        }
        return -1;
    }
}