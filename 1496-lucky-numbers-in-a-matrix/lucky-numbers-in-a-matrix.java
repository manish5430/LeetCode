class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> minval = new ArrayList<>();
        ArrayList<Integer> maxval = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int row =0; row< matrix.length; row++){
            int min = Integer.MAX_VALUE;
            for(int col=0; col < matrix[row].length; col++){
                if( matrix[row][col] <= min ){
                    min = matrix[row][col];
                }
            }
            minval.add(min);
        }

        for(int col =0; col< matrix[0].length; col++){
            int max = Integer.MIN_VALUE;
            for(int row=0; row < matrix.length; row++){
                if( matrix[row][col] >= max ){
                    max = matrix[row][col];
                }
            }
            maxval.add(max);
        }

        for(int num : minval){
            if(maxval.contains(num)){
                ans.add(num);
            }
        }
        return ans;
    }
}