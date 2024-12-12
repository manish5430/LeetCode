class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];

        for(int i = 0; i< nums.length;){
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        for(int i = 0; i< nums.length; i++){
            if(nums[i] != i+1){
                ans[0] = nums[i];
                ans[1] = i+1;
            }
        }
        return ans;
    }

    static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}