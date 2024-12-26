class Solution {
    public int findTargetSumWays(int[] nums, int target) {

        return recursion(nums, target, 0, 0);
       
    }

    static int recursion(int[] nums, int target, int index, int sum){
        if(index >= nums.length){
            if(sum == target) return 1;
            return 0;
        }

        int sub = recursion(nums, target, index +1, sum - nums[index]);
        int add = recursion(nums, target, index +1, sum + nums[index]);

        return sub + add;
    }
}