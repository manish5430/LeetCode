class Solution {
    public String convertToTitle(int num) {
        StringBuilder sb = new StringBuilder();

        while(num > 0){
            sb.append((char)((num-1) %26  + 'A'));
            num = (num-1) /26;
        }
        return sb.reverse().toString();
    }
}