class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        recursion(nums, 0, target, result, list);
        return result;
    }

    static void recursion(int[] nums, int i, int target, ArrayList<List<Integer>> result,
                                ArrayList<Integer> list){
        if(target < 0 || i == nums.length){
            return;
        }

        if(target == 0){
            result.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[i]);
        recursion(nums, i, target - nums[i], result, list);
        list.remove(list.size() -1);

        recursion(nums, i+1, target, result, list);
    
    }
}