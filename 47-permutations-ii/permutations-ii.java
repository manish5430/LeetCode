class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];

        backtracking(nums, visited, list, new ArrayList<Integer>());
        return list;
    }

    static void backtracking(int[] nums, boolean[] visited, ArrayList<List<Integer>> result, 
                                                        ArrayList<Integer> list){
        if(list.size() == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0; i< nums.length; i++){
            if(visited[i]) continue;

            if(i> 0 && nums[i] == nums[i-1] && !visited[i-1]) continue;
            
            visited[i] = true;
            list.add(nums[i]);   
            backtracking(nums, visited, result, list);
            list.remove(list.size() -1);  
            visited[i] = false;
        }
    }
}