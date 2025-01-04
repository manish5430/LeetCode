class Solution {
    public int countPalindromicSubsequence(String s) {
        HashSet<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            set.add(c);
        }
        
        int count = 0;
        for(char c : set){
            int first = -1;
            int last = -1;
            for(int i = 0; i< s.length(); i++){
                if(c == s.charAt(i)){
                    if(first == -1){
                        first = i;
                    }
                    last = i;
                }
            }
            if(first == last) continue;   // same index no match 

            HashSet<Character> set1 = new HashSet<>();
            for(int i = first+1; i< last; i++){
                set1.add(s.charAt(i));
            }
            count += set1.size();  // for every c in set we gonna check 
        }

        return count;
    }
}