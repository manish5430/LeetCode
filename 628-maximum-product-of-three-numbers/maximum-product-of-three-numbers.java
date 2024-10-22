class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        int a = nums[0] * nums[1] * nums[n-1];
        int b = nums[n-1] * nums[n-2] * nums[n-3];
      
        ans = Math.max(a, b);
        return ans;
    }
}