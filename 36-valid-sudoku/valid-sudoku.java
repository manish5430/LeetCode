class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;

        for(char[] nums : board){
            HashMap<Character, Integer> map = new HashMap<>();
            for(char c : nums){
                if(c != '.'){
                map.put(c, map.getOrDefault(c, 0) +1);
            
                if(map.get(c) >1) return false;
                }
            }
        }

        int col = 0;
        while(col < n){
            HashMap<Character, Integer> map2 = new HashMap<>();
            for(int i = 0; i< n; i++){                
                char c2 = board[i][col];
                if(c2 != '.'){
                map2.put(c2, map2.getOrDefault(c2, 0) +1);
            
                if(map2.get(c2) >1) return false;
                }
            }
            col++;
        }  

        if(!shortGrid(board, 0, 0)) return false;
        return true;
        
    }

    static boolean shortGrid(char[][] board, int rows, int cols){
        if(rows > board.length-1 || cols > board.length -1){
            return true;
        }
        HashMap<Character, Integer> map3 = new HashMap<>();

        for (int i = rows; i < rows + 3; i++) {
            for (int j = cols; j < cols + 3; j++) {
                char c3 = board[i][j];
                if (c3 != '.') {
                    map3.put(c3, map3.getOrDefault(c3, 0) +1);

                    if(map3.get(c3)> 1) return false;
                }
            }
        }
        if(! shortGrid(board, rows, cols+3))  return false;

        return shortGrid(board, rows+3, cols);
    }
}