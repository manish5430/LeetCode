class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        for(int i =0; i< nums.length;){
            int index; 
            index = nums[i] -1;
            //nums[i] = index +1;

            if( nums[i] != nums[index]){
                swap(nums, i, index);
            }
            else{
                i++;
            }
        }

        for(int i =0; i< nums.length; i++){
            if( nums[i] != (i+1)){
                list.add(i+1);
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