class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s1 = sentence.split(" ");
        int n = searchWord.length();

        for(int i = 0; i< s1.length; i++){
            if(s1[i].length() >= n){
                String s2 = s1[i].substring(0, n);
                if(s2.equals(searchWord)){
                    return i+1;
                }
            }
        }
        return -1;
        
    }
}