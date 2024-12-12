class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);

        int x = 0;
        // x gotta be between 0 to nums.length because the no. of elements taht could be bigger than x acn only be all the elements that its length
        // and we are checkign the count for every no. form 0 to n
        while(x <= nums.length){
            int count = 0;

            for(int num : nums){
                if( x <= num){
                    count++;
                }
            }

            if( x == count){
                return x;
            }

            x++;
        }

        return -1;
        
    }
}