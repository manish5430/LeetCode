class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String c : patterns){
            if( word.contains(c)){
                count++;
            }
        }
        return count; 
    }
}