class Solution {
    public int firstMissingPositive(int[] nums) {
       int n = nums.length;

        for(int i=0; i< n;){
            int correct = nums[i] -1;
            if(nums[i] > 0  &&   nums[i] < n    &&    nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        for(int i =0; i< n; i++){
            if(nums[i] != (i+1)){
                return (i+1);
            }
        }
        return (n+1);
    }

    static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}