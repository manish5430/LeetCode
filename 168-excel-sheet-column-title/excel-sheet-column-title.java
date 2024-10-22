class Solution {
    public String convertToTitle(int num) {
        StringBuilder sb = new StringBuilder();
        
        while( num > 0){
            int n = (num -1) % 26;
            sb.append((char)(n + 'A'));
            num = (num-1) / 26;
        }
        sb.reverse();
        return sb.toString();
    }
}