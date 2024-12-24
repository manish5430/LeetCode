class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        boolean[][] board = new boolean[n][n];
        return NQueens(board, 0);

    }

    static ArrayList<List<String>> NQueens(boolean[][] board, int row){
        ArrayList<List<String>> list = new ArrayList<>();
        if(row == board.length){
            list.add(everyRow(board));
            return list;
        }

        for(int col = 0; col< board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;    // place it over there 

                list.addAll(NQueens(board, row +1));

                board[row][col] = false;
            }
        }
        return list;
    }

    static boolean isSafe(boolean[][] board, int row, int col){
        // vertically 
        for(int i = 0; i< row; i++){
            if(board[i][col]){
                return false;    // not available anymore 
            }
        }

        // diagonally left 
        int minLeft = Math.min(row, col);
        for(int i = 1; i<= minLeft; i++){
            if(board[row -i][col -i]){
                return false;
            }
        }

        // diagonal          for god sake this is -col here
        int minRight = Math.min(row, board.length -col -1);
        for(int i = 1; i<= minRight; i++){
            if(board[row-i][col +i]){
                return false;
            }
        }

        return true;   // even after all these false if still there is anyspace left 
    }

    static ArrayList<String> everyRow(boolean[][] board){
        ArrayList<String> sublist = new ArrayList<>();
        
        for(boolean[] row : board){            
            StringBuilder sb = new StringBuilder();

            for(boolean element : row){
                if(element){
                    sb.append("Q");
                }else{
                    sb.append(".");
                }
            }
            sublist.add(sb.toString());
        }
        return sublist;
    }
}