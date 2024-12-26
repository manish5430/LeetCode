class Solution {
    public void solveSudoku(char[][] board) {
        int[][] sudoku = new int[board.length][board[0].length];

        for(int i = 0; i< board.length; i++){
            for(int j = 0; j< board.length; j++){
                if(board[i][j] == '.'){
                    sudoku[i][j] = 0;
                }else{
                    sudoku[i][j] = board[i][j] - '0';
                }
            }
        }
        if(backtracking(sudoku)){
            // update teh board array itself from solved sudoku[][]
            for(int i = 0; i< board.length; i++){
                for(int j = 0; j< board.length; j++){
                    board[i][j] = (char)(sudoku[i][j] + '0');
                }
            }
        }
        display(board);
    }

    static boolean backtracking(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean isEmptyLeft = false;
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    isEmptyLeft = true;
                    break;
                }
            }
            if(isEmptyLeft == true){
                break;  // move to the next row 
            }
        }
        if(isEmptyLeft == false){
            return true;  // evryone is placed
        }

        for(int number = 1; number<= 9; number++){
            if(isSafe(board, row, col, number)){
                board[row][col] = number;
            
// this is to find the next empty cell and if we find the next empty cell then then
// the isemptyleft will be true and it will not retunr true meaning it will keep fiinding 
// the next empty cell untill all the eclls are filled
                if(backtracking(board)){
                    return true; 
                    // here it wont even come to true untill finding all the empty cells 
                }else{
                    board[row][col] = 0; 
                    // simple backtracking meaning sudoku is not solved even after filling all 
                    // cell so backtrack 
                }
            }
        }
        return false;   // cannnot solve sudoku 
    }

    static boolean isSafe(int[][] board, int row, int col, int number){
        // checking every col of a row
        for(int i = 0; i< 9; i++){
            if(board[row][i] == number){
                return false;
            }
        }

        // checking in one particular column for every row 
        for(int i = 0; i< 9; i++){
            if(board[i][col] == number){
                return false;
            }
        }

        // checking for every 3 x 3 grid 
        int sqrt = (int)Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for(int i = rowStart; i< rowStart + sqrt; i++){
            for(int j = colStart; j< colStart + sqrt; j++){
                if(board[i][j] == number){
                    return false;
                }
            }
        }
        return true;
    }
    static void display(char[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}