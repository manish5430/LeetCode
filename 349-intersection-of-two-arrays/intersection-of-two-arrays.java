class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i : nums1){
            if(search(i, nums2) == true){
                if(search2(i, arr) == false){
                    arr.add(i);
                }
            }
        }
        int[] ans = new int[arr.size()];
        for(int i=0; i<ans.length; i++){
            ans[i] = arr.get(i);
        }
    return ans;
    }

    static boolean search(int num, int[] arr){
        for(int a : arr){
            if( num == a)  return true;
        }
        return false;
    }

    static boolean search2(int num, ArrayList<Integer> arr){
        for(int a : arr){
            if( num == a) return true;
        }
        return false;
    }
}