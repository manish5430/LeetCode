class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalsum = 0;
        int actualsum = 0;

        totalsum = n*(n+1)/2;
        for(int num : nums){
            actualsum += num;
        }
        return (totalsum - actualsum);
    }
}