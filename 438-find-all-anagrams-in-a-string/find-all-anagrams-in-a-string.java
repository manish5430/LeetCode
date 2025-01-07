class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        if(s.length() < p.length()) return list;

        for(int i = 0; i< p.length(); i++){
            freq1[p.charAt(i) - 'a']++;
            freq2[s.charAt(i) - 'a']++;
        }

        if(isMatch(freq1, freq2)) list.add(0);  // initial window starts at 0th index 

        for(int i = 1; i<= s.length() - p.length(); i++){
            freq2[s.charAt(i-1) - 'a']--;
            freq2[s.charAt(i + p.length() -1) - 'a']++;

            if(isMatch(freq1, freq2))  list.add(i);
        }
        return list;
    }

    static boolean isMatch(int[] freq1, int[] freq2){
        for(int i = 0; i< 26; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }
}