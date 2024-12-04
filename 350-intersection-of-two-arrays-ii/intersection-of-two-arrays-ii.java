class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freqArr = new int[1001];
        ArrayList<Integer> list = new ArrayList<>();

        for(int num : nums2){
            freqArr[num]++;
        }

        for(int n : nums1){
            if(freqArr[n] > 0){
                list.add(n);
                freqArr[n]--;
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i< ans.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}