class Solution {
    public int[] findThePrefixCommonArray(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] arr = new int[n];
        
        int sum = 0;
        for(int i = 0; i< n; i++){
            int count = 0;
            for(int j = 0; j<= i; j++){
                if(nums1[i] == nums2[j]){
                    count++;
                }
                if(nums1[j] == nums2[i] && i != j){
                    count++;
                }
            }
            sum += count;
            arr[i] = sum;
        }

        return arr;
    }
}