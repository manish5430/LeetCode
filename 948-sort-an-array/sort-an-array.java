class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums);
        
    }

    static int[] mergeSort(int[] nums){
        if(nums.length == 1)  return nums;
        int mid = nums.length /2;

        int[] first = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] second = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(first, second);
    }

    static int[] merge(int[] first, int[] second){
        int[] result = new int[first.length + second.length];

        int i = 0; 
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                result[k] = first[i];
                i++;
            }else{
                result[k] = second[j];
                j++;
            }
            k++;
        }
        while(i< first.length){
            result[k] = first[i];
            i++;
            k++;
        }
        while(j< second.length){
            result[k] = second[j];
            j++;
            k++;
        }
        return result;
    }
}