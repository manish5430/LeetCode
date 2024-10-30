class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i= 0; i<= rowIndex; i++){
            List<Integer> row = new ArrayList<>(i+1);
            for(int j = 0; j<= i; j++){
                if( j == 0 || j == i){
                    row.add(1);
                }
                else{
                    int num = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                    row.add(num);
                }
            }
            result.add(row);
        }
        return result.get(rowIndex);      
    }
}