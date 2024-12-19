class Solution {
    public int maxChunksToSorted(int[] nums) {
        int[] sort = nums.clone();
        Arrays.sort(sort);

        int count = 0;

        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i< nums.length; i++){
            sum += nums[i];
            sum2 += sort[i];                

            if(sum == sum2){
                count++;               
            }
        }
        return count;
    }
}