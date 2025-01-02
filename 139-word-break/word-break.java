class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);

        Boolean[] memo = new Boolean[s.length()];

        return recursion(s, set, 0, memo);

    }

    static boolean recursion(String s, HashSet<String> set, int index, Boolean[] memo){
        if(index == s.length()){
            return true;
        }

        if(memo[index] != null){
            return memo[index];
        }

        for(int i = index; i< s.length(); i++){
            if(set.contains(s.substring(index, i+1))){
                if(recursion(s, set, i+1, memo)){
                    return memo[index] = true;
                }              
            }         
        }
        return memo[index] = false;
        
    }

    // static boolean isPresent(String[] s1, String s){
    //     for(String str : s1){
    //         if(s.equals(str)){
    //             return true;
    //         }
    //     }
    //     return false;
    // }       

}