class Solution {
    public int removeDuplicates(int[] nums) {
       HashSet<Integer> set = new HashSet<>();

       for(int num : nums){
        set.add(num);
       }
       
       int[] ans = new int[set.size()];
       int i = 0;
       for(int num : set){
        ans[i++] = num;
       }

       Arrays.sort(ans);
       
       int index=0;
       for(int num : ans){
        nums[index++] = num;
       }
    return set.size();
    }
}