class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freqArr = new int[26];

        for(char ch : s1.toCharArray()){
            freqArr[ch - 'a']++;
        }

        for(int i = 0; i<= s2.length()- s1.length(); i++){
            String s = s2.substring(i, i + s1.length());

            int[] freq2 = new int[26];
            for(char c : s.toCharArray()){
                freq2[c - 'a']++;
            }

            boolean match = true;
            for(int j = 0; j< 26; j++){
                if(freq2[j] != freqArr[j]){
                    match = false;
                    break;
                }
            }

            if(match) return true;

        }
        return false;  
    }
}