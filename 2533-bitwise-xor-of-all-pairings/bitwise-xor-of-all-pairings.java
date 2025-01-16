class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int ans = 0;

        if(n1 %2 != 0){
            for(int num : nums2){
                ans ^= num;
            }
        }

        if(n2 %2 != 0){
            for(int num : nums1){
                ans ^= num;
            }
        }
        return ans;
    }
}