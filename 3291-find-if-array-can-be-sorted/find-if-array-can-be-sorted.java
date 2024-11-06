class Solution {
    public boolean canSortArray(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i= 0; i< nums.length; i++){
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        if(Arrays.equals(arr, nums)){
            return true;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if(nums[j] <= nums[j+1]){
                    continue;
                }
                else{
                    if (Integer.bitCount(nums[j]) == Integer.bitCount(nums[j+1])) {
                    // Swap nums[i] and nums[j]
                        int temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                    }else{
                        return false;
                    }
                }
            }
        }
        return Arrays.equals(nums, arr);
    }
} 