class Solution {
    public int characterReplacement(String s, int k) {
        //HashMap<Character, Integer> map = new HashMap<>();
        int[] freq = new int[26];
        int count = 0;
        int len = 0;
        int left = 0;
        int right = 0;
        while(right < s.length()){
            //map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) +1);
            //count = Math.max(count, map.get(s.charAt(right)));

            freq[s.charAt(right) - 'A']++;
            for(int num : freq){
                count = Math.max(count, num);
            }
            // count = Math.max(count, freq[s.charAt(right) - 'A']);

            while((right - left +1) - count > k){
                //map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0) -1);
                //if(map.get(s.charAt(left)) == 0) map.remove(s.charAt(left));

                freq[s.charAt(left) - 'A']--;
                left++;
            }
            len = Math.max(len, right - left +1);
            right++;           
        }
        return len;
    }
}