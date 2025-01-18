class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        int left = 0;
        int right = 0;

        while(right < s.length()){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) +1);

            while(map.size() == 3){
                count += (s.length() - right);

                map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0) -1);
                if(map.get(s.charAt(left)) == 0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
            right++;
        }
        return count;
        
    }
}