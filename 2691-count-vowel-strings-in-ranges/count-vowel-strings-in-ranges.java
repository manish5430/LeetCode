class Solution {
    public int[] vowelStrings(String[] nums, int[][] queries) {
        int[] prefix = new int[nums.length +1];
        String s1 = "aeiou";

        for(int i = 0; i< nums.length; i++){
            String str = nums[i];
            if(s1.contains(String.valueOf(str.charAt(0))) && 
                    s1.contains(String.valueOf(str.charAt(str.length()-1)))){
                        prefix[i+1] = prefix[i] +1;   // add 1 to whatever it was 
            }
            else{
                prefix[i+1] = prefix[i];  // pass the same number 
            }
        }
        
        int[] ans = new int[queries.length];
        for(int i = 0; i< queries.length; i++){
            int n1 = queries[i][0];
            int n2 = queries[i][1];  // only has 2 numbers in it 

            ans[i] = prefix[n2 +1] - prefix[n1];
        }

        return ans;        
    }
}