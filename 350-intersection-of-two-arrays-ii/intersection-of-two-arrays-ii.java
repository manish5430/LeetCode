class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int freqArr[] = new int[1001];

        for(int num : nums1){
            freqArr[num]++;
        }

        for(int n : nums2){
            if(freqArr[n] > 0){
                list.add(n);
                freqArr[n]--;
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = list.get(i);
        }        
        return ans;      
    
    }
}