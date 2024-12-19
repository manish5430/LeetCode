class Solution {
    public int maxChunksToSorted(int[] nums) {
        int[] sort = nums.clone();
        Arrays.sort(sort);

        int i = 0; 
        int count = 0;
        while(i< nums.length){

            int sum = 0;
            int sum2 = 0;
            for(int j = i; j< nums.length; j++){
                sum += nums[j];
                sum2 += sort[j];                

                if(sum == sum2){
                    count++;
                    i = j +1;               
                }
            }
        }
        return count;
    }
}