class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        ArrayList<List<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<>());

        for(int num : nums){
            int size = list.size();
            for(int i = 0; i< size; i++){
                ArrayList<Integer> subset = new ArrayList<>(list.get(i));
                subset.add(num);
                list.add(subset);
            }
        }
        set.addAll(list);
        return new ArrayList<>(set);
    }
}