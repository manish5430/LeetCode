class Solution {
    public int singleNonDuplicate(int[] nums) {
        int[] freqArr = new int[100000];

        for(int num : nums){
            freqArr[num]++;
        }
        
        for(int n : nums){
            if(freqArr[n] == 1){
                return n;
            }
        }
        return -1;
    }
}