class Solution {
    public int subsetXORSum(int[] nums) {
        int total = 0;
        for(int num : nums){
            total |= num;    // bitwise OR of all numbers together 
        }
        return total * (1 << (nums.length-1));
    }
}