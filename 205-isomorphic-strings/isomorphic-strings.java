class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())  return false;

        HashMap<Character, Character> Map = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(Map.containsKey(c1)){
                if(Map.get(c1) != c2){
                    return false;
                }
            }
            else{
                if(Map.containsValue(c2)){
                    return false;
                }else{
                    Map.put(c1, c2);
                }
            }
        }
        return true;
    }
}