class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] isVisited = new boolean[nums.length];
        recursion(nums, isVisited, new ArrayList<>(), result);
        return result;        
    }

    static void recursion(int[] nums, boolean[] isVisited, ArrayList<Integer> list,
                                                        ArrayList<List<Integer>> result){
        if(list.size() == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0; i< nums.length; i++){
            if(isVisited[i]) continue;
            if(i> 0 && nums[i] == nums[i-1] && !(isVisited[i-1])) continue;

            isVisited[i] = true;
            list.add(nums[i]);
            recursion(nums, isVisited, list, result);
            list.remove(list.size() -1);
            isVisited[i] = false;
        }
    }
}