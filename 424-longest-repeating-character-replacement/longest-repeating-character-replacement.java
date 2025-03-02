class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int count = 0;
        int len = 0;


        while(j < s.length()){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) +1);
            count = Math.max(count, map.get(s.charAt(j)));

            while((j-i+1) - count > k){
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) -1);
                if(map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
                i++;
            }
            len = Math.max(len, j- i+1);
            j++;
        }
        return len;
    }
}