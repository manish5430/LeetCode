class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freqArr = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if( i!=j && nums[i] > nums[j]){
                    freqArr[i]++;
                }
            }
        }
        return freqArr;
    }
}