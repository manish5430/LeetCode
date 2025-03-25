class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        ArrayList<int[]> list1 = new ArrayList<>();
        ArrayList<int[]> list2 = new ArrayList<>();

        for(int[] nums : rectangles){
            int x1 = nums[0];
            int x2 = nums[2];
            int y1 = nums[1];
            int y2 = nums[3];

            list1.add(new int[]{x1, x2});
            list2.add(new int[]{y1, y2});
        }
        
        int[][] nums1 = list1.toArray(new int[list1.size()][]);
        int[][] nums2 = list2.toArray(new int[list2.size()][]);

        int[][] result1 = merge(nums1);
        int[][] result2 = merge(nums2);

        return result1.length >= 3  || result2.length >= 3;
        
        
    }

    public int[][] merge(int[][] nums) {
        int n = nums.length;

        Arrays.sort(nums, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> list = new ArrayList<>();
        list.add(nums[0]);

        for(int i = 1; i< n; i++){
            if(nums[i][0] < list.get(list.size()-1)[1]){
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