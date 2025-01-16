class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        for(char c : s1.toCharArray()){
            freq[c - 'a']++;
        }

        for(int i = 0; i<= s2.length() - s1.length(); i++){
            String s = s2.substring(i, i+ s1.length());
            int[] freq1 = new int[26];
            
            for(char c : s.toCharArray()){
                freq1[c - 'a']++;
            }

            boolean isMatch = true;
            for(int j = 0; j< 26; j++){
                if(freq[j] != freq1[j]){
                    isMatch = false;
                }
            }
            if(isMatch) return true;     // if there is even one permutation present
        }
        return false;
        
    }
}