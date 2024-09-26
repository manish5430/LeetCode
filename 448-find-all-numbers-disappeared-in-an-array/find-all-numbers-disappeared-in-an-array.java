class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
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
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                list.add( i+1 );
            }
        }
        return list;
    }
    static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}