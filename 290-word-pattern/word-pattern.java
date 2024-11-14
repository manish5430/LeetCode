class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();

        int i = -1;
        for (String word : s.split(" ")) {
            i++;
            if (i == pattern.length()) {
                return false; 
            }
            char currentChar = pattern.charAt(i);
            if (map.containsKey(currentChar)) {
                if (!map.get(currentChar).equals(word)) {
                    return false;
                }
            } else {
                if (map.containsValue(word)) {
                    return false; 
                }
                map.put(currentChar, word);
            }
        }
        return i == pattern.length() - 1; 
    }
}