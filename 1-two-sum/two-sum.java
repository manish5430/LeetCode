class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i< nums.length-1; i++){
            for(int j = i+1; j< nums.length; j++){
                int sum = nums[i] + nums[j];
                if( sum == target){
                    list.add(i);
                    list.add(j);
                }else{
                    continue;
                }
            }
        }

        return list.stream().mapToInt(Integer :: intValue).toArray();
        
      
    }
}