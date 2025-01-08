class Solution {
    public int countPrefixSuffixPairs(String[] s) {
        int count = 0;
        
        for(int i = 0; i< s.length-1; i++){
            for(int j = i+1; j< s.length; j++){
                if(s[j].startsWith(s[i]) && s[j].endsWith(s[i])){
                    count++;
                }
            }
        }
        return count;        
    }

}