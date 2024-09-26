class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int n){
        List<Boolean> result = new ArrayList<>();

        int maxval = nums[0];
        for(int i=0; i<nums.length; i++){
            if(maxval < nums[i]){
                maxval = nums[i];
            }
        }

        for(int num : nums){
            if((num + n) >= maxval){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;    
    }
}