class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k) return false;
        if(k == s.length()) return true;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) +1);
        }

        int count = 0;
        for(int n : map.values()){
            if(n % 2 == 1){
                count++;
            }
        }
        if(count > k) return false;
        else return true;

    }
}