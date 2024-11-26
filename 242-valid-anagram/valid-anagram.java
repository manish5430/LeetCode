class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> Map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            Map.put(c, Map.getOrDefault(c, 0) +1);
        }
        for(char c : t.toCharArray()){
            if(Map.getOrDefault(c, 0)> 0){
                Map.put(c, Map.getOrDefault(c, 0) -1);
            }else{
                return false;
            }      
        }
        return true;       


    }
}