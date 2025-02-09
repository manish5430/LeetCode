class Solution {
    public long countBadPairs(int[] nums) {
        long n = nums.length;
        long total = n * (n-1)/2;
        long count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++){
            int num = i - nums[i];
            int prev = map.getOrDefault(num, 0);
            count += prev;

            map.put(num, map.getOrDefault(num, 0) +1);
        }
        return total - count;
    }
}