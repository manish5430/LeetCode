class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] freq = new int[26];
        int[] freq1 = new int[26];
        if(s.length() < p.length()) return new ArrayList<>();

        for(int i = 0; i< p.length(); i++){
            freq[p.charAt(i) - 'a']++;
            freq1[s.charAt(i) - 'a']++;
        }
        if(isMatch(freq, freq1)) list.add(0);

        for(int i = 1; i<= s.length() - p.length(); i++){
            freq1[s.charAt(i-1) - 'a']--;
            freq1[s.charAt(i + p.length() -1) - 'a']++;

            if(isMatch(freq, freq1)) list.add(i);
        }
        return list;
    }

    static boolean isMatch(int[] freq, int[] freq1){
        for(int i= 0; i< 26; i++){
            if(freq[i] != freq1[i]){
                return false;
            }
        }
        return true;
    }
}