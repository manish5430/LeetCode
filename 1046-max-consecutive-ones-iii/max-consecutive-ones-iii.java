class Solution {
    public int longestOnes(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int len = 0;

        while(j< nums.length){
            map.put(nums[j], map.getOrDefault(nums[j], 0) +1);

            if(map.getOrDefault(0, 0) <= k){
                len = Math.max(len, j-i+1);
            }

            while(map.getOrDefault(0, 0) > k){
                map.put(nums[i], map.getOrDefault(nums[i], 0) -1);
                if(map.get(nums[i]) == 0) map.remove(nums[i]);
                i++;
            }
            j++;
        }
        return len;
    }
}