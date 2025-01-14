class Solution {
    ArrayList<List<Integer>> result= new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        
        recursion(nums, 0, new ArrayList<>());
        return result;       
    }
    
    public void recursion(int[] nums, int i, ArrayList<Integer> list){
        if(i == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[i]);
        recursion(nums, i+1, list);
        list.remove(list.size() -1);

        recursion(nums, i+1, list);
    }
}