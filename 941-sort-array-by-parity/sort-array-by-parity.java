class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;                  
        int j = nums.length - 1;   
        while (i < j) {
            if (nums[i] % 2 == 0) {
                i++;
            } else if (nums[j] % 2 != 0) { 
                j--;
            } else { 
                swap(nums, i, j);
                i++;
                j--;
            }
        }

        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}