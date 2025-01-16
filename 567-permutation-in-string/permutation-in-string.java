class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        int[] freq1 = new int[26];
        if(s1.length() > s2.length()) return false;

        for(int i = 0; i< s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
            freq1[s2.charAt(i) - 'a']++;
        }

        if(isMatch(freq, freq1)) return true;

        for(int i = 1; i<= s2.length() - s1.length(); i++){
            freq1[s2.charAt(i-1) - 'a']--;
            freq1[s2.charAt(i + s1.length() -1) - 'a']++;

            if(isMatch(freq, freq1)) return true;        
        }
        return false;        
    }

    static boolean isMatch(int[] freq, int[] freq1){
        for(int i =0; i< 26; i++){
            if(freq[i] != freq1[i]){
                return false;
            }
        }
        return true;
    }
}