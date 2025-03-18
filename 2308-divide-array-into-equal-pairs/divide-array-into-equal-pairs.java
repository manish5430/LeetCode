class Solution {
    public boolean divideArray(int[] nums) {
        int[] freq = new int[501];
        for(int num : nums){
            freq[num]++;
        }

        for(int n : freq){
            if(n != 0 && n%2 != 0) return false;
        }
        return true;
        
    }
}