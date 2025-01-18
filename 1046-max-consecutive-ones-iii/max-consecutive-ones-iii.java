class Solution {
    public int longestOnes(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = 0;
        int left = 0;
        int right = 0;

        while(right < nums.length){
            map.put(nums[right], map.getOrDefault(nums[right], 0) +1);

            if(map.getOrDefault(0, 0) <= k){
                int length = right - left + 1;
                if(length > len) len = length;
            }

            while(map.getOrDefault(0, 0) > k){
                map.put(nums[left], map.getOrDefault(nums[left], 0) -1);
                if(map.get(nums[left]) ==  0) map.remove(nums[left]);
                left++;
            }
            right++;
        }
        return len;

    }
}