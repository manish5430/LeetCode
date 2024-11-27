class Solution {
    public String sortString(String s) {
        
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) +1);
        }

        ArrayList<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        while(sb.length() < s.length()){
            for(char c : list){
                if(map.get(c) > 0){
                    sb.append(c);
                    map.put(c, map.get(c) -1);
                }
            }
            for(int i = list.size()-1; i>= 0; i--){
                char c = list.get(i);
                if(map.get(c) > 0){
                    sb.append(c);
                    map.put(c, map.get(c) -1);
                }
            }
        }
        return sb.toString();        
    }
}