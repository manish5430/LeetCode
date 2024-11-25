class Solution {
    public int maxRepeating(String s, String word) {
        int count = 0;
        String w1 = word;

        while( s.contains(w1)){
            w1 += word;
            count++;
        }
        return count;
    }
}