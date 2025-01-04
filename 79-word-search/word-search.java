class Solution {
    public boolean exist(char[][] board, String word) {

        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[r].length; c++){
                if(board[r][c] == word.charAt(0)){
                    if(dfs(board, r, c, word, 0)) return true;
                }
            }
        }
        return false;        
    }

    static boolean dfs(char[][] board, int r, int c, String word, int i){
        if(i == word.length()) return true;

        if(r < 0 || r >= board.length || c < 0 || c >= board[r].length) return false;

        if(board[r][c] == ' ' || board[r][c] != word.charAt(i)) return false;

        char ch = board[r][c];
        board[r][c] = ' '; 

        if(dfs(board, r +1, c, word, i+1)) return true;
        if(dfs(board, r -1, c, word, i+1)) return true;
        if(dfs(board, r, c +1, word, i+1)) return true;
        if(dfs(board, r, c -1, word, i+1)) return true;

        board[r][c] = ch;
        return false;
    }
}