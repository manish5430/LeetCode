class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        long ans = 0;

        for(int i = 0; i< k; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
            sum += nums[i];
        }
        if(map.size() == k) ans = sum;

        int left = 0;
        int right = k;
        while(right < nums.length){
            map.put(nums[left], map.getOrDefault(nums[left], 0) -1);
            if(map.get(nums[left]) == 0) map.remove(nums[left]);
            sum -= nums[left];
            left++;

            map.put(nums[right], map.getOrDefault(nums[right], 0) +1);
            sum += nums[right];
            right++;

            if(map.size() == k) ans = Math.max(ans, sum);
        }
        return ans;        
    }
}