class Solution {
    public int longestPalindrome(String s) {
        int ans = 0;
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) +1);
        }
        for(int count : map.values()){
            if(count % 2 == 0){
                ans += count;
            }else{
                ans += count-1;
            }           
        } 
        for(int count : map.values()){
            if(count % 2 != 0){
                return ans + 1;
            }
        } 
        return ans;     
        
    }
}