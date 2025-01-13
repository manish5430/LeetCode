class Solution {
    public int minimumLength(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) +1);
        }

        for(char c : s.toCharArray()){
            if(map.getOrDefault(c, 0) %2 == 0){
                while(map.getOrDefault(c, 0) > 2){
                    map.put(c, map.getOrDefault(c, 0) -1);
                }
            }
            if(map.getOrDefault(c, 0) %2 != 0){
                while(map.getOrDefault(c, 0) >1){
                    map.put(c, map.getOrDefault(c, 0) -1);
                }
            }
        }
        int sum = 0;
        for(int num : map.values()){
            sum += num;
        }
        return sum;        
    }
}