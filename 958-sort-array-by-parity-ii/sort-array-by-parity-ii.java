class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
       
        int i = 0;
        int j = 0;
        for(int n : nums){
            if(n% 2 == 0){
                ans[i] = n;
                i += 2;
            }
            else{
                ans[j*2 +1] = n;
                j++;
            }
        }

        return ans;        
       
    }
}