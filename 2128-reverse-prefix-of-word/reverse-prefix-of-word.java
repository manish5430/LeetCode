class Solution {
    public String reversePrefix(String word, char ch) {
        int num = word.indexOf(ch);
        String s = word.substring(0, num+1);
        String s2 = word.substring(num+1, word.length());
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        sb.append(s2);
        
        return sb.toString();
    }
}