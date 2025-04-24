class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : nums){
            set.add(num);
        }
        int size = set.size();
        int left = 0;
        int right = 0;
        int count = 0;

        while(right < nums.length){
            map.put(nums[right], map.getOrDefault(nums[right], 0) +1);

            while(map.size() == size){
                count += (nums.length - right);

                map.put(nums[left], map.getOrDefault(nums[left], 0) -1);
                if(map.get(nums[left]) == 0) map.remove(nums[left]);
                left++;
            }
            right++;
        }

        return count;
    }
}