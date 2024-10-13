class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length -1; i>1; i--){
            int a = nums[i];
            int b = nums[i-1];
            int c = nums[i-2];

            int sum = a+b+c;
            if(b+c > a){
                return sum;
            }
        }
        return 0;
    }
}