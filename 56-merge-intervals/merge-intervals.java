class Solution {
    public int[][] merge(int[][] nums) {
        int n = nums.length;

        Arrays.sort(nums, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> list = new ArrayList<>();
        list.add(nums[0]);

        for(int i = 1; i< n; i++){
            if(nums[i][0] <= list.get(list.size()-1)[1]){
                list.get(list.size()-1)[1] = Math.max(list.get(list.size()-1)[1], nums[i][1]);
            }
            else{
                list.add(nums[i]);
            }
        }
        int[][] ans = new int[list.size()][2];
        int index = 0;
        for(int[] arr : list){
            ans[index][0] = arr[0];
            ans[index][1] = arr[1];
            index++;
        }
        return ans;
    }
}