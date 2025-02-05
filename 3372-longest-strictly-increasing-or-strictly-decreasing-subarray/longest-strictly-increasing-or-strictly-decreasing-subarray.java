class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int len1 = 0;
        int len2 = 0;
        for(int i = 0; i< nums.length-1; i++){
            int count = 1;
            while(i< nums.length-1 && nums[i] < nums[i+1]){
                count++;
                i++;
            }
            len1 = Math.max(count, len1);
        }

        for(int i = 0; i< nums.length-1; i++){
            int count = 1;
            while(i< nums.length-1 && nums[i] > nums[i+1]){
                count++;
                i++;
            }
            len2 = Math.max(count, len2);
        }

        return Math.max(len1, len2);        
    }
}