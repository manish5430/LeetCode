class Solution {
    public int longestSubstring(String s, int k) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }

        if(s.length() == 0) return 0;

        int i = 0;
        while(i < s.length() && freq[s.charAt(i) - 'a'] >= k){
            i++;
        }

        if(i == s.length()) return s.length();

        int left = longestSubstring(s.substring(0, i), k);
        int right = longestSubstring(s.substring(i+1, s.length()), k);

        return Math.max(left, right);
    }
}