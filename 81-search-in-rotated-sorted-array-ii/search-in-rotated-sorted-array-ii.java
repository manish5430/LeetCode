class Solution {
    public boolean search(int[] nums, int target) {
        // int start = 0; 
        // int end = nums.length -1;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return true;
            }
        }

        // while(start <= end){
        //     int mid = start + (end-start)/2;



        //     if(target == nums[mid]){
        //         return true;
        //     }

        //     if(nums[start] <= nums[mid]){
        //         if( nums[start] <= target && target < nums[mid]){
        //             end = mid -1;
        //         }
        //         else{
        //             start = mid+1;
        //         }
        //     }else{
        //         if( nums[mid] < target && target <= nums[end]){
        //             start = mid+1;
        //         }
        //         else{
        //             end = mid-1;
        //         }
        //     }
        
        //  }
        return false;
    }
}