class Solution {
    public String convertToTitle(int num) {
        if(num == 0) return "";
        char c = (char)((num -1) % 26 + 'A');
        return convertToTitle((num-1)/26) + c;
    }
}