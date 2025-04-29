class Solution {
    public long countSubarrays(int[] nums, long k) {
        HashMap<Integer, Long> map = new HashMap<>();

        int left = 0;
        long count = 0;
        long sum = 0;

        for(int right = 0; right< nums.length; right++){
            sum += nums[right];
            int len = right - left +1;
            long score = sum * len;

            map.put(right, score);
            
            while(left <= right && score >= k){
                sum -= nums[left];
                left++;
                len = right - left +1;
                score = sum * len;
            }

            count += (right - left +1);
        }

        return count;
        
    }
} 