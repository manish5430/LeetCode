class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for(int j =i; j< nums.length; j++){
                if( (i != j )  && (nums[i] + nums[j]) == target){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        int[] ans= new int[list.size()];
        for(int i = 0; i< ans.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}