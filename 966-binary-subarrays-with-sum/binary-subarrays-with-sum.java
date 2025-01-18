class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
        int[] freq = new int[nums.length +1];
        freq[0] = 1;
        int sum = 0;
        int count = 0;

        for(int i = 0; i< nums.length; i++){
            sum += nums[i];

            if(sum >= k){
                count += freq[sum -k];
            }
            freq[sum]++;
        }
        return count;
    }
}