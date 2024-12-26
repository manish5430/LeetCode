class Solution {
    public void solveSudoku(char[][] board) {

        backtracking(board);
        System.out.println(Arrays.deepToString(board));
        
    }

    static boolean backtracking(char[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean isEmpty = false;
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(board[i][j] == '.'){
                    row = i;
                    col = j;
                    isEmpty = true;
                    break;
                }
            }
            if(isEmpty == true)  break;
        }
        if(isEmpty == false)  return true;  // meaning end of empty cells 

        for(int num = 1; num<= 9; num++){
            if(isSafe(board, row, col, num)){
                board[row][col] = (char)(num + '0');

                if(backtracking(board)){
                    return true;
                }else{
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    static boolean isSafe(char[][] board, int row, int col, int num){
        for(int i = 0; i< 9; i++){
            if(board[row][i] == (char)(num + '0')){
                return false;
            }
        }

        for(int i = 0; i< 9; i++){
            if(board[i][col] == (char)(num + '0')){
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for(int r = rowStart; r < rowStart + sqrt; r++){
            for(int c = colStart; c < colStart + sqrt; c++){
                if(board[r][c] == (char)(num + '0')){
                    return false;
                }
            }
        }
        return true;
    }
}