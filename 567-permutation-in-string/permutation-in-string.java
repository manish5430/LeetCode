class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freqArr = new int[26];
        int[] freq2 = new int[26]; 

        if(s1.length() > s2.length()) return false;

        for(int i = 0; i< s1.length(); i++){
            freqArr[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;  // for initial window just that 
        }

        if(isMatch(freqArr, freq2)) return true;

        for(int i = 1; i<= s2.length()- s1.length(); i++){

            freq2[s2.charAt(i-1) - 'a']--;   // last one dcrement 
            freq2[s2.charAt(i + s1.length() -1) - 'a']++;  // +1 char increament 

            if(isMatch(freqArr, freq2)) return true;
        }
        return false;
           
    }

    static boolean isMatch(int[] freqArr, int[] freq2){
        for(int i = 0; i<26; i++){
            if(freqArr[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }
}