class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                if(nums[i][j] == target ){
                    return true;
                }
            }
        }
        return false;
    }
}