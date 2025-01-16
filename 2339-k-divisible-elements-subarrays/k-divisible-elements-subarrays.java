class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i< nums.length; i++){
            int count = 0;
            for(int j = i; j< nums.length; j++){
                if(nums[j] %p == 0){
                    count++;
                }
                if(count <= k){
                    set.add(Arrays.toString(Arrays.copyOfRange(nums, i, j+1)));
                }
            }            
        }
        return set.size();
    }
}