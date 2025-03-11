class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        int left = 0;
        int right = 0;
        
        // this initail window logic fails what if starting ke characters repeated ho 
        // it wont count them correctly 
        
        // for(int i = 0; i< s.length(); i++){
        //     map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) +1);

        //     if(map.size() == 3){
        //         right = i+1;
        //         count += (s.length() - i);
        //         break;
        //     }
        // }
        
        while(right < s.length()){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) +1);

            while(map.size() == 3){
                count += (s.length() - right);
                map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0) -1);

                if(map.get(s.charAt(left)) == 0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
            right++;            
        }
        return count;
    }
}