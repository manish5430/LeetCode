class Solution {
    public int[] findThePrefixCommonArray(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] arr = new int[n];
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i< n; i++){
            set.add(nums1[i]);

            int count = 0;
            for(int j = 0; j<= i; j++){
                if(set.contains(nums2[j])){
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}