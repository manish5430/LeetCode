class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        String w1 = word;

        while(sequence.contains(w1)){
            w1 += word;
            count++;            
        }
        return count;
    }
}