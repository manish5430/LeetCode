class Solution {
    public int arrayPairSum(int[] nums) {
        int[] ans = new int[nums.length/2];
        int sum = 0;

        Arrays.sort(nums);
        for(int i = 0; i< nums.length/2; i++){
            ans[i] = nums[i*2];
        }

        for(int n : ans){
            sum += n;
        }
        return sum;
    }
}