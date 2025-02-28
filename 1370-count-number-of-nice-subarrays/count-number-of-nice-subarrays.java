class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] nums = arr.clone();
        for(int i = 0; i< arr.length; i++){
            if(arr[i] %2 == 0) nums[i] = 0;
            else nums[i] = 1;
        }
        
        int prefixSum = 0;
        int count = 0;

        for(int num : nums){
            prefixSum += num;

            if(prefixSum == k) count++;
            if(map.containsKey(prefixSum - k)) count += map.get(prefixSum - k);

            map.put(prefixSum, map.getOrDefault(prefixSum , 0) +1);
        }
        return count;
    }
}