class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) +1);
            if( freqMap.get(num) >= 2){
                return true;
            }
        }
        return false;
    }
}