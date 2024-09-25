class Solution {
    public int[] findRightInterval(int[][] nums) {
        int ar[][] = new int[nums.length][2];
        
        for(int i=0;i<nums.length;i++){
            ar[i][0] = nums[i][0];
            ar[i][1] = i;
        }
        Arrays.sort(ar,new Comparator<int[]>(){
            public int compare(int a[],int b[]){
                return a[0]-b[0];
            }
        });
        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = binarySearch(ar,nums[i][1]);
        }
        return ans;
    }
    private int binarySearch(int[][] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid][0]>=target){
                ans = arr[mid][1];
                end = mid - 1;
            } else start = mid + 1;
        }
        return ans;
    }
}