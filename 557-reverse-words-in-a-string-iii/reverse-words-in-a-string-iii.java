class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for(String word : words){
            StringBuilder temp = new StringBuilder(word);
            temp.reverse();
            sb.append(temp).append(" ");
        }
        return sb.deleteCharAt(sb.length()-1).toString();

    }
}