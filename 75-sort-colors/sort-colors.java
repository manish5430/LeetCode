class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        quickSort(nums, start, end);
        
        
    }

    static void quickSort(int[] nums, int start, int end){
        if(start >= end) return; 

        int i = start;
        int pivot = nums[end];

        for(int j = start; j< end; j++){
            if(nums[j] < pivot){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }

        int temp = nums[i];
        nums[i] = nums[end];
        nums[end] = temp;

        quickSort(nums, start, i-1);
        quickSort(nums, i+1, end);

        

    }
}