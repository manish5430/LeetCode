class Solution {
    public String minWindow(String s, String t) {
        if(s.length() == 0 || t.length() == 0) return "";

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) +1);
        }

        int i = 0;
        int j = 0;
        int len = Integer.MAX_VALUE;
        int start = 0, end = 0;
        while(j< s.length()){

            if(map.containsKey(s.charAt(j))){
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) -1); 
            }
            j++;
        

            while(isEmpty(map)){
                int length = j-i;
                if(length < len){
                    len = length;
                    start = i;
                    end = j;
                }

                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) +1);
                }
                i++;
            }
        }
        if(len == Integer.MAX_VALUE) return "";
        else return s.substring(start, end);
        
    }
    
    static boolean isEmpty(HashMap<Character, Integer> map){
        for(int num : map.values()){
            if(num > 0){
                return false;
            }
        }
        return true;
    }
}