class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i = 1; i< n; i++){
            if(nums[i-1] > nums[i]){
                count++;
            }
   
            if(count == 1){
                if(nums[0] < nums[n-1]) return false;
            } 
            if(count > 1) return false;
        }
        return true;
    }
}