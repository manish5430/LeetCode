class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for(int num : nums){
            hashmap.put(num, hashmap.getOrDefault(num, 0) +1);
        }

        Integer[] boxedNum = new Integer[nums.length];
        for(int i = 0; i< nums.length; i++){
            boxedNum[i] = nums[i];
        }

        Arrays.sort(boxedNum, (a, b)  -> {
            int freqA = hashmap.get(a);
            int freqB = hashmap.get(b);

            if( freqA != freqB){
                return freqA - freqB;
            }
            else{
                return b - a;
            }
        });

        for(int i = 0; i< boxedNum.length; i++){
            nums[i] = boxedNum[i];
        }    
        return nums;    
    }
}