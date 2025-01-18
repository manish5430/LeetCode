class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] prefixSum = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            if(nums[i] %2 == 0) prefixSum[i] = 0;
            else prefixSum[i] = 1;
        }  

        int[] freq = new int[nums.length +1];
        freq[0] = 1;
        int sum = 0;
        int count = 0;

        for(int i = 0; i< prefixSum.length; i++){
            sum += prefixSum[i];

            if(sum >= k){
                count = count + freq[sum -k];
            }
            freq[sum]++;
        }
        return count;
    }
}