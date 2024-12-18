class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) +1);
        }

        for(int i = 0; i< order.length(); i++){
            char ch = order.charAt(i);
            while(s.contains(String.valueOf(ch))  && map.getOrDefault(ch, 0) >0 ){
                sb.append(ch);
                map.put(ch, map.getOrDefault(ch, 0) -1);
            }
        }
        String s1 = sb.toString();
        
        for(int i = 0; i< s.length(); i++){
            if(!s1.contains(String.valueOf(s.charAt(i)))){
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}