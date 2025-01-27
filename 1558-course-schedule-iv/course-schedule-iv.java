class Solution {
    public List<Boolean> checkIfPrerequisite(int n, int[][] pre, int[][] queries) {
        boolean[][] mat = new boolean[n][n];
        for(int i = 0; i< pre.length; i++){
            int s = pre[i][0];
            int d = pre[i][1];
            mat[s][d] = true;
        }

        for(int v = 0; v< n; v++){
            for(int s = 0; s< n; s++){
                for(int d = 0; d< n; d++){
                    mat[s][d] = mat[s][d] || mat[s][v] && mat[v][d];
                }
            }
        }

        ArrayList<Boolean> list = new ArrayList<>();
        for(int i = 0; i< queries.length; i++){
            int s = queries[i][0];
            int d = queries[i][1];
            list.add(mat[s][d]);
        }

        return list;        
    }
}