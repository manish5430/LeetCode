class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        
        for(int i = 0; i< nums1.length; i++){
            int j = 0;
            while(j < nums2.length){
                if(nums1[i] == nums2[j]){
                    Stack<Integer> stack = new Stack<>();
                    for(int k = nums2.length-1; k> j; k--){
                        stack.push(nums2[k]);
                    }
                    while(! stack.isEmpty() && stack.peek() < nums2[j]){
                        stack.pop();
                    }
                    if(stack.isEmpty())  ans[i] = -1;
                    else ans[i] = stack.pop();
                }
                j++;
            }
        }
        return ans;
    }
}