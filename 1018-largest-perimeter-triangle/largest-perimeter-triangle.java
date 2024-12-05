class Solution {
    public int largestPerimeter(int[] nums) {
        if(nums.length < 3) return 0;
        int sum = 0;

        Arrays.sort(nums);
        for(int i = 2; i< nums.length; i++){
            if(nums[i-2] + nums[i-1] > nums[i]){
                sum = nums[i] + nums[i-1] + nums[i-2];

            }
        }
        return sum;        
    }
}