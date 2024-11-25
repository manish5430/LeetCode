class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] str = s.split(" ");
        int n = str.length;
        return str[n-1].length();        
    }
}