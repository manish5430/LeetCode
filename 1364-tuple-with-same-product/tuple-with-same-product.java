class Solution {
    public int tupleSameProduct(int[] nums) {
        int total = 0;
        int n = nums.length;
        Arrays.sort(nums);  // very important 

        for(int i = 0; i< n; i++){
            for(int j = n-1; j>= i+1; j--){
                int product = nums[i] * nums[j];
                HashSet<Integer> set = new HashSet<>();

                for(int c = i+1; c< j; c++){
                    if(product % nums[c] == 0){
                        int d = product / nums[c];

                        if(set.contains(d)){
                            total += 8;     // all combination somehow 
                        }
                        set.add(nums[c]);   // nums[c] will be treated as d next time 
                    }
                }
            }
        }
        return total;
    }
}