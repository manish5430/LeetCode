class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int sum = nums[start] + nums[end];

            if(sum == target){
                ans[0] = start +1;
                ans[1] = end +1;
                return ans;
            }
            if(sum > target){
                end--;
            }else{
                start++;
            }
        }
        return ans;
    }
}