class Solution {
    public String reversePrefix(String word, char ch) {
        int num = word.indexOf(ch);
        String s1 = word.substring(0, num+1);
        String s2 = word.substring(num+1, word.length());

        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();

        String str = sb.toString();
        str = str + s2;
        return str;
              
    }
}