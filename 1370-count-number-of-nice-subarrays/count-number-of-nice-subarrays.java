class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
        int[] nums = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            if(arr[i] %2 != 0) nums[i] = 1;
            else nums[i] = 0;
        }

        int[] freq = new int[nums.length +1];
        freq[0] = 1;    // this is  for subarrays starting from 0 because whenwe are getting 
        int prefixSum = 0; // count += freq[prefixSum -k] it would be freq[0] and that has to
        int count = 0;       // be 1 to count it as one subarray sum 

        for(int num : nums){
            prefixSum += num;

            if(prefixSum >= k)  count += freq[prefixSum -k];

            freq[prefixSum]++;
        }
        return count;
    }
}