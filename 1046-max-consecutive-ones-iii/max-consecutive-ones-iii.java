class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int len = 0;
        int count = k;

        while(j< nums.length){
            if(nums[j] == 0) count--;

            while(count < 0){
                if(nums[i] == 0) count++;
                i++;
            }
            len = Math.max(len, j-i+1);
            j++;
        }
        return len;            
    }
}