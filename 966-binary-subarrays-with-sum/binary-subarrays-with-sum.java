class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
        int[] freq = new int[nums.length +1];
        freq[0] = 1;
        int prefixSum = 0;
        int count = 0;

        for(int num : nums){
            prefixSum += num;

            if(prefixSum >= k)  count += freq[prefixSum - k];

            freq[prefixSum]++;

        }
        return count;
    }
}