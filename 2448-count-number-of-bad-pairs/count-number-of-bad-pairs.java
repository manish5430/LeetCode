class Solution {
    public long countBadPairs(int[] nums) {
        long n = nums.length;
        long total = n * (n-1)/2;
        long count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++){
            map.put(nums[i] - i, map.getOrDefault(nums[i] - i, 0) +1);
        }

        for(int num : map.keySet()){
            long k = map.get(num);
            count += k * (k-1)/2;
        }

        return total - count;
    }
}