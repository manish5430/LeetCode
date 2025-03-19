class Solution {
    public int longestNiceSubarray(int[] nums) {
        int bitMask = 0;
        int max = 0;
        int i = 0;
        for(int j = 0; j< nums.length; j++){
            while((bitMask & nums[j]) != 0){
                bitMask = bitMask ^ nums[i];
                i++;
            }
            bitMask = bitMask | nums[j];
            max = Math.max(max, j-i+1);
        }
        return max;
    }
}