class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for(int i=0; i < n;){
            int correct = nums[i];
            if( (nums[i] < n) && (nums[i] != nums[correct])){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        for(int i=0; i<n; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return n;
    }

    static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        
    }
}
