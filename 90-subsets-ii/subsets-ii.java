class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        ArrayList<List<Integer>> result = recursion(nums, 0, new ArrayList<Integer>());
        set.addAll(result);

        return new ArrayList<>(set);
    }

    static ArrayList<List<Integer>> recursion(int[] nums, int i, ArrayList<Integer> list){
        ArrayList<List<Integer>> result = new ArrayList<>();

        if(i == nums.length){
            result.add(new ArrayList<>(list));
            return result;
        }

        list.add(nums[i]);
        result.addAll(recursion(nums, i+1, list));
        list.remove(list.size() -1);
        result.addAll(recursion(nums, i+1, list));

        return result;
    }
}