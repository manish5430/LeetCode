class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        recursion(nums, 0, target, ans, list);
        return ans;        
    }

    static void recursion(int[] nums, int i, int target, ArrayList<List<Integer>> ans,
                            ArrayList<Integer> list){
        if(i == nums.length || target < 0){
            return;
        }

        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[i]);
        recursion(nums, i, target - nums[i], ans, list);
        list.remove(list.size() -1);    // backtracking 

        // see whats happening here we are reusing the same number again but we want to use each no once standard case we can just simply skip and consider what to do with the next number so these two recursive calls are sufficient

        recursion(nums, i+1, target, ans, list);            
        
    }
}