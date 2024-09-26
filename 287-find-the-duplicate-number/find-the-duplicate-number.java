class Solution {
    public int findDuplicate(int[] nums) {
        int[] freqArr = new int[nums.length];

        for(int num : nums){
            freqArr[num]++;
        }
        for(int n : nums){
            if(freqArr[n] > 1){
                return n;
            }
        }
        return -1;
    }
}