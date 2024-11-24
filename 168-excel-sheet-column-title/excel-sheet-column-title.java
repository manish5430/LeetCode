class Solution {
    public String convertToTitle(int col) {
        if(col == 0){
            return "";
        }

        col--;
        char c = (char)('A' + col % 26);
        return convertToTitle(col/26) + c;       
        
    }
}