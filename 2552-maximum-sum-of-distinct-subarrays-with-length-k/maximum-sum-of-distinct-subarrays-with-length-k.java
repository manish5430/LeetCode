class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long ans = 0;
        long sum = 0;
        int duplicate = 0;

        for(int i= 0; i< k; i++){
            int count = map.getOrDefault(nums[i], 0);
            if(count == 1) duplicate++;
        // no shittttttttt we are only duplicate++ how many numbers are more than 1 here
        // we check duplicate++ when the element become duplicate the first time during sliding window calculation  

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
            if(count1 == 2) duplicate--; // so when count1 is like maybe 50 it is still counted as duplicate i mean its duplicates are still present there and we will do duplicate-- only when it is count ==2 and simultaneously decrementing its frequency everytime

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