class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) +1);
        }

        int i = s.length();
        while(i > 0){
            for(char c : map.keySet()){
                if(map.get(c) == i){
                    while(map.getOrDefault(c, 0) >0){
                        sb.append(c);
                        map.put(c, map.getOrDefault(c, 0) -1);
                    }
                }
            }
            i--;
        }
        return sb.toString();
    }
}