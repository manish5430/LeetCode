class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) +1);
        }

        ArrayList<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b) -> b -a);

        StringBuilder sb = new StringBuilder();

        int i = 0; 
        while(i< list.size()){
            char ch = list.get(i);
            int count = Math.min(map.getOrDefault(ch, 0), repeatLimit);

            for(int n = 0; n< count; n++){
                sb.append(ch);
                map.put(ch, map.getOrDefault(ch, 0) -1);
            }

            if(map.getOrDefault(ch, 0) == 0){
                i++;   // simply move on to the next index
            }
            else{   // else if any element left we will wait for others to finish
                
                if(i+1 < list.size()){
                    char ch2 = list.get(i+1);
                    sb.append(ch2);
                    map.put(ch2, map.getOrDefault(ch2, 0) -1);

                    if(map.getOrDefault(ch2, 0) == 0){
                        list.remove(i+1);
                    }
                }else{
                    break;
                }               
            }
        }

        return sb.toString();
    }
}