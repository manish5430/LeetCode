class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int n : nums2){
            list.add(n);
        }
        for(int n : nums1){
            if(list.contains(n)){
                set.add(n);
            }
        }

        int i = 0;
        int[] ans = new int[set.size()];
        for(int num : set){
            ans[i++] = num;
        }
        
        return ans;    
    }
}