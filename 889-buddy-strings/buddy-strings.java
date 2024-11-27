class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;

        if(s.equals(goal)){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c -'a']++;
            }
            for(int freq : count){
                if(freq > 1){
                    return true;
                }
            }
        }

        int first = -1;
        int second = -1;
        int mismatched = 0;
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)){
                mismatched++;
                if(mismatched > 2){
                    return false;
                }else{
                    if(first == -1) first = i;
                    second = i;
                }                
            }
        }
        if(mismatched == 2)
        return s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first);
        return false;
    }
}