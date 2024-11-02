class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        int n = words.length;

        for(int i= 0; i< words.length-1; i++){
            if(words[i].charAt(words[i].length()-1)  != words[i+1].charAt(0)){
                return false;
            }   
        }

        if(words[n-1].charAt(words[n-1].length()-1) != words[0].charAt(0)){
            return false;
        }

        return true;        
    }
}