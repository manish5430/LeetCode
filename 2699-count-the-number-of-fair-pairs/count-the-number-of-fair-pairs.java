class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums) ;
        long count1 = 0 ;
        long count2 = 0 ;
        int n = nums.length ;

        for(int i = 0 ; i< n; i++){
            int num = lower - nums[i];
            int start = i+1;
            int end = n-1;
            while(start <= end){
                int mid = start + (end - start)/2;
                if(nums[mid] < num){
                    start = mid +1;
                }
                else{
                    end = mid -1;
                }
            }
            count1 += start - (i+1);
            
        }

        for(int i = 0 ; i< n; i++){
            int num = upper - nums[i];
            int start = i+1;
            int end = n-1;
            while(start <= end){
                int mid = start + (end - start)/2;
                if(nums[mid] <= num){
                    start = mid +1;
                }
                else{
                    end = mid -1;
                }
            }
            count2 += start - (i+1);
        }

        return count2 - count1;  
    }
}