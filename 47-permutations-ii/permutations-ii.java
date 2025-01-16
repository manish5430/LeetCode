class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }

        backtracking(nums, map, list, new ArrayList<Integer>());
        return list;
    }

    static void backtracking(int[] nums, HashMap<Integer, Integer> map,
                      ArrayList<List<Integer>> result, ArrayList<Integer> list){

        if(list.size() == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
         
        for(int num : map.keySet()){
            if(map.getOrDefault(num, 0) == 0 ){
                continue;
            }

            list.add(num);
            map.put(num, map.getOrDefault(num, 0) -1);
            backtracking(nums, map, result, list);
            
            list.remove(list.size() -1);
            map.put(num, map.getOrDefault(num, 0) +1);
        }
    }
}