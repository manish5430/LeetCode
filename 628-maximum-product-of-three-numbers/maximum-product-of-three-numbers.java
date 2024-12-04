class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int m1 = nums[0] * nums[1] * nums[nums.length-1];
        int m2 = nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];

        return Math.max(m1, m2);
    }
}