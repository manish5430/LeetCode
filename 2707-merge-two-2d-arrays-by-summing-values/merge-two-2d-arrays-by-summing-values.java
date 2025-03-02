class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        ArrayList<int[]> list = new ArrayList<>();

        int i = 0;
        int j = 0;
        while(i< m && j< n){
            if(nums1[i][0] == nums2[j][0]){
                list.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            }
            else if(nums1[i][0] < nums2[j][0]){
                list.add(nums1[i]);
                i++;
            }
            else{
                list.add(nums2[j]);
                j++;
            }
        }

        while(i< m){
            list.add(nums1[i]);
            i++;
        }
        while(j< n){
            list.add(nums2[j]);
            j++;
        }

        return list.toArray(new int[list.size()][]);
    }
}