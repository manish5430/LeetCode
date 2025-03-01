class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        for(int i = 0; i< n-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(num != 0){
                list.add(num);
            }
        }

        int count = 0;
        for(int num : nums){
            if(num == 0) count++;
        }
        while(count >0){
            list.add(0);
            count--;
        }
        
        return list.stream().mapToInt(Integer :: intValue).toArray();
    }
}