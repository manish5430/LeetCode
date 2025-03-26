class Solution {
    public int[][] merge(int[][] nums) {
        int n = nums.length;
        ArrayList<int[]> list = new ArrayList<>();

        Arrays.sort(nums, (a,b) -> a[0] - b[0]);
        list.add(nums[0]);

        for(int i = 1; i< n; i++){
            if(list.get(list.size()-1)[1] >= nums[i][0]){
                list.get(list.size()-1)[1] = Math.max(list.get(list.size()-1)[1], nums[i][1]);
            }
            else{
                list.add(nums[i]);
            }
        }
        int[][] ans = list.toArray(new int[list.size()][]);
        return ans;
    }
}