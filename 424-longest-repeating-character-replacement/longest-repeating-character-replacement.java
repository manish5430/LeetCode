class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int count = 0;
        int len = 0;
        int left = 0;
        int right = 0;
        while(right < s.length()){
            freq[s.charAt(right) - 'A']++;
            count = Math.max(count, freq[s.charAt(right) - 'A']);

            while((right - left +1) - count > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            len = Math.max(len, right - left +1);
            right++;           
        }
        return len;
    }
}