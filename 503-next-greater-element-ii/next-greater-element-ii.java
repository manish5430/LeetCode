class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for(int i = 0; i< n; i++){
            for(int j = 1; j< n; j++){
                if(nums[(i+j) % n] > nums[i]){
                    ans[i] = nums[(i+j) %n];
                    break;
                }
            }
        }
        return ans;
    }
}