class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        ArrayList<String> list = new ArrayList<>();
        int[] maxfreq = new int[26];
        for(String word : words2){
            int[] freq = new int[26];
            for(char c : word.toCharArray()){
                freq[c - 'a']++;
            }
            for(int i = 0; i< 26; i++){
                maxfreq[i] = Math.max(maxfreq[i], freq[i]);
            }
        }

        for(String s : words1){
            int[] freq1 = new int[26];
            for(char c : s.toCharArray()){
                freq1[c -'a']++;
            }

            boolean isMark = true;
            for(int i = 0; i< 26; i++){
                if(freq1[i] < maxfreq[i]){
                    isMark = false;
                }
            }

            if(isMark){
                list.add(s);
            }
        }
        return list;
    }
}