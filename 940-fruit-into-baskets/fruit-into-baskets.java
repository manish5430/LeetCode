class Solution {
    public int totalFruit(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = 0;
        
        while(j < nums.length){
            map.put(nums[j], map.getOrDefault(nums[j], 0) +1);

            while(map.size() > 2){
                map.put(nums[i], map.getOrDefault(nums[i], 0) -1);

                if(map.get(nums[i]) == 0) map.remove(nums[i]);
                i++;
            }

            if(map.size() <= 2)  max = Math.max(max, j-i+1);
            j++;
        }
        return max;
    }
}