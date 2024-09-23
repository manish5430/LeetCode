class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       // ArrayList<Integer> arr = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> arr = new HashSet<>();

        for(int n2 : nums2){
            set.add(n2);
        }

        for(int n1 : nums1){
            if(set.contains(n1)){
                arr.add(n1);
                set.remove(n1);
            }
        }
        // int[] ans = new int[arr.size()];
        // // for(int i=0; i<ans.length; i++){
        // //     ans[i] = arr.get(i);
        // // }

        int[] ans = new int[arr.size()];
        int index = 0;
        for(int num : arr){
            ans[index++] = num;
        }
        return ans;
    }
}