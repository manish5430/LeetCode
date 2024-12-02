class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s1 = sentence.split(" ");
        int n = searchWord.length();

        for(int i = 0; i< s1.length; i++){
            if(s1[i].startsWith(searchWord))
                return i+1;
        }
        return -1;
        
    }
}