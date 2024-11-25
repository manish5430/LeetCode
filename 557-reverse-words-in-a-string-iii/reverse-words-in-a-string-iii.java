class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for(String word : words){
            char[] chars = word.toCharArray();
            int i = 0, j = chars.length-1;
            while(i< j){
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++; j--;
            }
            String s2 = new String(chars);
            sb.append(s2).append(" ");            
        }
        return sb.deleteCharAt(sb.length()-1).toString();
    }
}