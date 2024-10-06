class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i< nums.length; i++){
            int count = 0;
            for(int j=0; j< nums.length; j++){
                if(i != j  && nums[i] > nums[j]){
                    count++;
                }
            }
            list.add(count);
        }
        int[] ans = new int[list.size()];
        for(int i=0; i< ans.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}