class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        boolean[] ans = new boolean[queries.length];  
        // to store true and false only once for a sybarray 

        int[] prefix = new int[n];  // to store each pairs parity 
        // if its different parity dont do anything
        // if its same parity increase 1 so we can identify it

        // indices of nums and prefix are same 
        for(int i = 1; i< n; i++){
            if(nums[i-1]%2 == nums[i]%2){   // checking nums parity 
                prefix[i] = 1 + prefix[i-1];
            }else{
                prefix[i] = prefix[i-1];
            }
        }

        for(int i = 0; i< queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];

            ans[i] = (prefix[end] - prefix[start] == 0);
        }

        return ans;
    }
}