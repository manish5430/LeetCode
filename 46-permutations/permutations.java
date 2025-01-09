class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        recursion(nums, new ArrayList<>(), result);
        return result;        
    }

    static void recursion(int[] nums, ArrayList<Integer> list,ArrayList<List<Integer>> result){
        if(list.size() == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0; i< nums.length; i++){
            if(list.contains(nums[i])){
                continue;
            }

            list.add(nums[i]);
            recursion(nums, list, result);
            list.remove(list.size() -1);
        }
    }
}