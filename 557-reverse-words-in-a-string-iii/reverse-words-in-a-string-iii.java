class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for(String word : words){
            char[] character = word.toCharArray();
            int i = 0;
            int j = character.length-1;            
            while(i< j){
                char temp = character[i];
                character[i] = character[j];
                character[j] = temp;
                i++; j--;
            }   
            String str2 = new String(character);
            sb.append(str2).append(" ");
        }
        
        return sb.deleteCharAt(sb.length()-1).toString();
    }
            
}