class Solution {
    public int minimumSize(int[] nums, int maxOps) {
        int start = 1;
        int end = 0;
        for(int num : nums){
            end = Math.max(end, num);
        }

        while(start < end){
            int mid = start + (end -start)/2;

            int ops = 0;
            for(int n : nums){
                ops += (n - 1) /mid;  
                // operations are required to ensure no part is larger than mid.
            }

            if(ops <= maxOps){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}