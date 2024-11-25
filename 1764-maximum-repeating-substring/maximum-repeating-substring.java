class Solution {
    public int maxRepeating(String s, String word) {
        if(!s.contains(word)){
            return 0;
        }
        int count = 0;
        int i = 0;
        while(i<= s.length()-word.length()){
            int count1 = 0;
            while(i<= s.length()-word.length()   &&   s.substring(i, i + word.length()).equals(word)){
                count1++;
                i = i+word.length();
            }
            count = Math.max(count, count1);
            if(count1 == 0){
                i++;
            }else{
                i = i- (word.length()-1);
            }
        }
        return count;
    }
}