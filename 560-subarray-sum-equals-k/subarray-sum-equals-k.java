class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int count = 0;

        for(int i = 0; i< nums.length; i++){
            prefixSum += nums[i];

            if(prefixSum == k) count++;

            if(map.containsKey(prefixSum -k)){
                count += map.get(prefixSum -k);
            }
            
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;        
    }
}