class Solution {
    public int[] buildArray(int[] nums) {      
       // ArrayList<Integer> arr = new ArrayList<>(nums.length);
       int[] arr = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
        
    }
}