class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long ans = 0;
        long sum = 0;
        int duplicate = 0;

        for(int i= 0; i< k; i++){
            int count = map.getOrDefault(nums[i], 0);
            if(count == 1) duplicate++;

            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
            sum += nums[i];
        }

        if(duplicate == 0){
            ans = sum;
        }

        int i = 0;
        int j = k;
        while(j < nums.length){

            int count1 = map.getOrDefault(nums[i], 0);
            if(count1 == 2) duplicate--;  // dupliacate will only be removed 
        // if count1 value si greter than 1 

            map.put(nums[i], map.getOrDefault(nums[i], 0) -1);
            if(map.get(nums[i]) == 0) map.remove(nums[i]);
            sum -= nums[i];
            i++;
            
            int count2 = map.getOrDefault(nums[j], 0);
            if(count2 == 1) duplicate++;   // meaning if already present just duplicate++
            map.put(nums[j], map.getOrDefault(nums[j], 0) +1);
            sum += nums[j];
            j++;

            if(duplicate == 0){
                ans = Math.max(ans, sum);
            }            
        }

        return ans;
    }
}