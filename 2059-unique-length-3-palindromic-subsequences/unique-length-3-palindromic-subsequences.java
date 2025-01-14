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

            HashSet<Character> set2 = new HashSet<>();
            for(int i = first +1; i< last; i++){
                set2.add(s.charAt(i));
            }
            count += set2.size();
        }
        return count;
    }
}