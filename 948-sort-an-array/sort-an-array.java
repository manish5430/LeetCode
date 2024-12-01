class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
        
    }

    static void mergeSort(int[] nums, int start, int end){
        if(start >= end) return;

        int mid = start + (end- start)/2;

        mergeSort(nums, start, mid);
        mergeSort(nums, mid+1, end);

        merge(nums, start, mid, end);
    }

    static void merge(int[] nums, int start, int mid, int end){
        int[] result = new int[end-start +1];

        int i = start;
        int j = mid+1;
        int k = 0;

        while(i<= mid && j <= end){
            if(nums[i] < nums[j]){
                result[k++] = nums[i++];
            }else{
                result[k++] = nums[j++];
            }
        }
        while(i <= mid){
            result[k++] = nums[i++];
        }
        while(j <= end){
            result[k++] = nums[j++];
        }

        for(int m = 0; m< result.length; m++){
            nums[start +m] = result[m];
        }
    }
}