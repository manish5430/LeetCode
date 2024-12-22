class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freqArr = new int[26];

        for(char ch : s1.toCharArray()){
            freqArr[ch - 'a']++;
        }

        for(int i = 0; i<= s2.length()- s1.length(); i++){

            int[] freq2 = new int[26]; 

            for(int j = i; j< i + s1.length(); j++){
                freq2[s2.charAt(j) - 'a'] ++;
            }

            boolean match = true;
            for(int k = 0; k< 26; k++){
                if(freq2[k] != freqArr[k]){
                    match = false;
                    break;
                }
            }

            if(match) return true;

        }
        return false;  
    }

    // static boolean isMatch(int[] freqArr, int[] freq2){
    //     for(int i = 0; i<26; i++){
    //         if(freqArr[i] != freq2[i]){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}