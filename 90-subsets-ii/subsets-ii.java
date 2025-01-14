class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        result.add(new ArrayList<>());
        Arrays.sort(nums);

        for(int num : nums){
            int size = result.size();
            for(int i = 0; i< size; i++){
                ArrayList<Integer> sublist = new ArrayList<>(result.get(i));
                sublist.add(num);
                result.add(sublist);
            }
        }
        set.addAll(result);
        return new ArrayList<>(set);
    }
}