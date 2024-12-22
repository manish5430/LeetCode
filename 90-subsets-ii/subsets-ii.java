class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> list = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        list.add(new ArrayList<>());

        for(int num : nums){
            int size = list.size();
            for(int i = 0; i< size; i++){
                ArrayList<Integer> sublist = new ArrayList<>(list.get(i));
                sublist.add(num);
                list.add(sublist);
            }
        }
        set.addAll(list);
        return new ArrayList<>(set);
    }
}