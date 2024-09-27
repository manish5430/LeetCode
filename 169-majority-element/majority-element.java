class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer, Integer> freqMap = new HashMap<>();
       int n= nums.length;

       for(int num : nums){
        freqMap.put(num, freqMap.getOrDefault(num, 0) +1);

        if( freqMap.get(num) > n/2){
            return num;
        }
       }
       return -1;
    }
}