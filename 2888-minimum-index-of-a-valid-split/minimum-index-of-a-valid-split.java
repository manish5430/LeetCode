class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for(Integer num : nums){
            map2.put(num, map2.getOrDefault(num, 0) +1);
        }

        for(int i = 0; i< nums.size(); i++){
            map1.put(nums.get(i), map1.getOrDefault(nums.get(i), 0) +1);
            map2.put(nums.get(i), map2.getOrDefault(nums.get(i), 0) -1);
            if(map2.getOrDefault(nums.get(i), 0) == 0) map2.remove(nums.get(i));
            
            // int maxVal1 = 0;
            // int maxKey1 = 0;
            // for(Integer n : map1.keySet()){
            //     if(map1.get(n) > maxVal1){
            //         maxVal1 = map1.get(n);
            //         maxKey1 = n;                    
            //     }
            // }
            // int maxVal2 = 0;
            // int maxKey2 = 0;
            // for(Integer n : map2.keySet()){
            //     if(map2.get(n) > maxVal2){
            //         maxVal2 = map2.get(n);
            //         maxKey2 = n;                    
            //     }
            // }
            
            //If we only checked maxKey1 == maxKey2, we’d stop at i=1 in that example because 2 is the most frequent in both [1, 2] and [2, 2]. But 2 isn’t dominant in [1, 2] (1 ≤ 2/2), so it’s a fake win. Dominance adds the “more than half” rule

            int leftsize = i+1;
            int rightsize = nums.size() - leftsize;
            
            if(map1.getOrDefault(nums.get(i), 0) > leftsize/2  &&  
                map2.getOrDefault(nums.get(i), 0) > rightsize/2){
                    return i;
            }
        }

        return -1;
    }
}