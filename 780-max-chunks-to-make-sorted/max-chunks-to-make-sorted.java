class Solution {
    public int maxChunksToSorted(int[] nums) {
        int[] sort = nums.clone();
        Arrays.sort(sort);

        int i = 0; 
        int count = 0;
        while(i< nums.length){
            for(int j = i; j< nums.length; j++){
                
                int[] nums1 = Arrays.copyOfRange(nums, i, j+1);
                int[] nums2 = Arrays.copyOfRange(sort, i, j+1);
                int sum = 0;
                for(int num : nums1){
                    sum += num;
                }

                int sum2 = 0;
                for(int num : nums2){
                    sum2 += num;
                }

                if(sum == sum2){
                    count++;
                    i = j +1;               
                }
            }
        }
        return count;
    }
}