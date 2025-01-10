class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxfreq = new int[26];
        ArrayList<String> list = new ArrayList<>();
        for(String str : words2){
            int[] freq = new int[26];
            for(char c : str.toCharArray()){
                freq[c - 'a']++;
            }

            for(int i = 0; i< 26; i++){
                maxfreq[i] = Math.max(freq[i], maxfreq[i]);
            }
        }
        
        // boolean isUniversal = true;  can not set it true outside the for
        // cause inside for loop changes made to it will be passed on to the next iteration
        // it wont be automatically true for next iteration 
        for(String s : words1){
            int[] freq1 = new int[26];
            for(char c : s.toCharArray()){
                freq1[c -'a']++;
            }
            
            boolean isUniversal = true;
            for(int i = 0; i< 26; i++){
                if(freq1[i] < maxfreq[i]){
                    isUniversal = false;
                }
            }

            if(isUniversal) list.add(s);
        }
        return list;
    }
}