class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        int i = 0; 
        int j = 0;
        
        while(j < s.length()){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) +1);

            while(map.size() == 3){
                count += (s.length() - j);

                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) -1);
                if(map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
                i++;
            }
            j++;
        }
        return count;
    }
}