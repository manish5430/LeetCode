class Solution {
    public int findDuplicate(int[] nums) {
        
        for(int i=0; i< nums.length;){
            int correct = nums[i] -1;

            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        return nums[nums.length-1];
    }

    static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}