class Solution {
    public String sortString(String s) {
        //since we haev only 26 letters to iterate over we can solve this in O(1) complexity
        int[] freqArr = new int[26];
        for(char c : s.toCharArray()){
            freqArr[c -'a']++;
        }

        StringBuilder sb = new StringBuilder();
        while(sb.length() < s.length()){
            for(int i = 0; i< 26; i++){
                if( freqArr[i] > 0){
                    sb.append((char)(i +'a'));
                    freqArr[i]--;
                }
            }
            for(int i = 25; i>=0; i--){
                if(freqArr[i] >0){
                    sb.append((char)(i +'a'));
                    freqArr[i]--;
                }
            }
        }
    
        return sb.toString();
    }
}