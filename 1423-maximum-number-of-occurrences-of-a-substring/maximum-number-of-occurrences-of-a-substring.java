class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        HashMap<String, Integer> map = new HashMap<>();
        int maxFreq = 0;
        
        for(int i = 0; i<= s.length() - minSize; i++){
            String s1 = s.substring(i, i + minSize);
                
            HashSet<Character> set = new HashSet<>();
            for(char c : s1.toCharArray()){
                set.add(c);
            }

// Using just count++ will only give the total count of valid substrings, not the most frequent substring.
            if(set.size() <= maxLetters){
                map.put(s1, map.getOrDefault(s1, 0) +1);
                maxFreq = Math.max(maxFreq, map.getOrDefault(s1, 0));
            }
        }
        return maxFreq;
    }
}