class Solution {
    public int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length-1);
        return nums;        
    }

    static void quicksort(int[] nums, int start, int end){
        if(start >= end) return;

        int i = start;
        int j = end;
        int mid = i + (j-i)/2;
        int pivot = nums[mid];

        while(i <= j){
            while(nums[i] < pivot){  // it will stop when it finds any no. not < pivot
                i++;
            }
            while(nums[j] > pivot){  // it will stop when it finds any no. not > pivot
                j--;
            }
            if(i <= j){    // swpa those two nums[i] and nums[j];
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        quicksort(nums, start, j);  // to the point j has come till now from right end
        quicksort(nums, i, end);   // from the point i has iterated froom starting 
    }

}