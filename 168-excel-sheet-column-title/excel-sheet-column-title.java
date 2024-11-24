class Solution {
    public String convertToTitle(int col) {
        StringBuilder sb = new StringBuilder();
        while(col > 0){
            int num = (col-1) % 26;
            char c = (char)('A' + num);
            sb.append(c);
            col = (col-1)/26;
        }
        return sb.reverse().toString();
        
    }
}