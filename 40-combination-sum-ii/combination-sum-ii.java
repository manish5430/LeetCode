class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        recursion(nums, 0, target, result, list);
        return result;        
    }

    static void recursion(int[] nums, int index, int target, ArrayList<List<Integer>> result,
                                ArrayList<Integer> list){
        if(target == 0){
            result.add(new ArrayList<>(list));
            return;
        }
        else{
            for(int i= index; i< nums.length; i++){
                if(i > index && nums[i] == nums[i -1]) continue;
                if(nums[i] > target)  break;
                    
                list.add(nums[i]);
                recursion(nums, i +1, target - nums[i], result, list);
                list.remove(list.size() -1);
                
            }
        }



    }
}