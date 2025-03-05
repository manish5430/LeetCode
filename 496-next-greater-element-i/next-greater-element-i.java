class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        
        for(int i = 0; i< nums1.length; i++){
            int j = 0;
            while(j < nums2.length){
                if(nums1[i] == nums2[j]){
                    boolean flag = false;
                    for(int k = j+1; k< nums2.length; k++){
                        if(nums2[k] > nums2[j]){
                            ans[i] = nums2[k];
                            flag = true;
                            break;
                        }
                    }
                    if(flag == false) ans[i] = -1;
                }
                j++;
            }
        }
        return ans;
    }
}