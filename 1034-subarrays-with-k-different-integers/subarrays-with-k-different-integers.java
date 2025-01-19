class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

        return recursion(nums, k) - recursion(nums, k-1);

    }

    static int recursion(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int left = 0;
        int right = 0;

        while(right < nums.length){
            map.put(nums[right], map.getOrDefault(nums[right], 0) +1);

            while(map.size() > k){
                map.put(nums[left], map.getOrDefault(nums[left], 0) -1);
                if(map.get(nums[left]) == 0) map.remove(nums[left]);
                left++;
            }
            count += (right - left +1);
            right++;
        }   
        return count;  
    }
}