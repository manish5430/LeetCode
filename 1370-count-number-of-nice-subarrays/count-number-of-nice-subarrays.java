class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
        int[] nums = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            if(arr[i] %2 != 0) nums[i] = 1;
            else nums[i] = 0;
        }

        int[] freq = new int[nums.length +1];
        freq[0] = 1;
        int prefixSum = 0;
        int count = 0;

        for(int num : nums){
            prefixSum += num;

            if(prefixSum >= k)  count += freq[prefixSum -k];

            freq[prefixSum]++;
        }
        return count;
    }
}