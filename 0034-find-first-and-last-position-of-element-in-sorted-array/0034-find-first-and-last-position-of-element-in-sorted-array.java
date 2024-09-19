class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = searchFirst(nums, target);
        int end = searchLast(nums, target);

        ans[0] = start;
        ans[1] = end;
        return ans;
        
    }
    static int searchFirst(int[] nums, int target){
        int ans = -1;
        int start = 0;
        int end = nums.length -1;

        while(start<=end){
            int mid =(start+end)/2;
            if(target<nums[mid]){
                end = mid-1;
            }
            else if(target>nums[mid]){
                start = mid+1;
            }
            else{
                ans = mid;
                end = mid-1;
            }
        }
        return ans;
    }

        static int searchLast(int[] nums, int target){
        int ans = -1;
        int start = 0;
        int end = nums.length -1;

        while(start<=end){
            int mid =(start+end)/2;
            if(target<nums[mid]){
                end = mid-1;
            }
            else if(target>nums[mid]){
                start = mid+1;
            }
            else{
                ans = mid;
                start = mid +1;
            }
        }
        return ans;
    }
}