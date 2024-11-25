class Solution {
    public int lengthOfLastWord(String s) {
       // s = s.trim();
        String[] str = s.split(" ");
        //int n = str.length;
        return str[str.length-1].length();        
    }
}