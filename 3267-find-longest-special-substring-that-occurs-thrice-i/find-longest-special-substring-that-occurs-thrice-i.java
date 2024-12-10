class Solution {
    public int maximumLength(String s) {
        List<String> list = new ArrayList<>();

        for(int i = 0; i< s.length(); i++){
            int index = i;
            while(index < s.length() && s.charAt(i) == s.charAt(index)){
                // here index is increasing not i  
                // i is fixed and index is icreasing as long as it gets same character
                // in while loop index is increasing so it will check i == index++
                list.add(s.substring(i, index +1));
                index++;
            }
        }

        // its a list of substrings now 
        HashMap<String, Integer> map = new HashMap<>();
        for(String sub : list){
            map.put(sub, map.getOrDefault(sub, 0) +1);
        }

        int max = 0;  // its to store the maximum length of sub string 
        for(String sub : map.keySet()){
            int count = map.get(sub);

            if(count >= 3){
                max = Math.max(max, sub.length());
            }
        }

        if(max == 0){
            return -1;
        }
        return max;
    }
}