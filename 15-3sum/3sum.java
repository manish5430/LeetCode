class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> setTriplet = new HashSet<>();
        Arrays.sort(nums);

        for(int i = 0; i< nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;

            int left = i+1; // take it a j pointer 
            int right = nums.length-1;  // k pointer 

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    setTriplet.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while(left< right && nums[left] == nums[left+1]) left++;
                    while(left< right && nums[right] == nums[right-1]) right--;

                    left++;
                    right--;
                }
                else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }            
        }
        return new ArrayList<>(setTriplet);
    }
}