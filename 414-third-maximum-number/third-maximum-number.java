class Solution {
    public int thirdMax(int[] nums) {
    
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }

        int[] ans = new int[set.size()];
        int i = 0;
        for(int num : set){
            ans[i++] = num;
        }

        Arrays.sort(ans);
        if(ans.length > 2){
            return ans[ans.length-3];
        }
        return ans[ans.length-1];
        
    }
}