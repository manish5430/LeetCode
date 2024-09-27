class Solution {
    public int[] findErrorNums(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i< nums.length;){
            int correct = nums[i] -1;

            if(nums[i] != nums[correct]){
                swap(nums, i , correct);
            }
            else{
                i++;
            }
        }
        for(int i=0; i< nums.length; i++){
            if(nums[i] != (i+1)){
                list.add(nums[i]);
                list.add(i+1);
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i< ans.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
    
    static void swap(int[] nums, int start, int end ){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}