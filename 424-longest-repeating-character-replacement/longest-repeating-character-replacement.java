class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        int len = 0;
        int left = 0;
        int right = 0;
        while(right < s.length()){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) +1);
            count = Math.max(count, map.get(s.charAt(right)));

            while((right - left +1) - count > k){
                map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0) -1);
                if(map.get(s.charAt(left)) == 0) map.remove(s.charAt(left));
                left++;
            }
            len = Math.max(len, right - left +1);
            right++;           
        }
        return len;
    }
}