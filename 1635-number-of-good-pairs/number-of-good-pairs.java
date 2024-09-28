class Solution {
    public int numIdenticalPairs(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            for(int j=0; j< nums.length; j++){
                if( i<j && nums[i] == nums[j]){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        int[] ans = new int[list.size()];
        int index = 0;
        for(int i=0; i<ans.length; i++){
            ans[index++] = list.get(i);
        }
        return (ans.length /2);
    }
}