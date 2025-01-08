class Solution {
    public int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length-1);
        return nums;
        
    }

    static void quicksort(int[] nums, int start, int end){
        if(start >= end) return;   // damn important to stop the recursion
        int i = start;
        int j = end;
        int mid = i + (j-i)/2;
        int pivot = nums[mid];

        while(i <= j){
            while(nums[i] < pivot){
                i++;
            }
            while(nums[j] > pivot){
                j--;
            }

            if(i <= j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        quicksort(nums, start, j);
        quicksort(nums, i, end);
    }
}