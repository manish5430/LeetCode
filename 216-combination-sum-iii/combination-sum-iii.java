class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        recursion(k, 1, n, result, list);
        return result;
    }

    static void recursion(int k, int index, int target, ArrayList<List<Integer>> result, 
                            ArrayList<Integer> list){
        // if(list.size() >= k && target == 0){
        //     result.add(new ArrayList<>(list));
        //     return;
        // }

        if(list.size() >= k){
            if(target == 0){
                result.add(new ArrayList<>(list));
            }
            return;
        }

        for(int i = index; i<= 9; i++){
            if(i <= target){
                list.add(i);
                recursion(k, i+1, target- i, result, list);
                list.remove(list.size() -1);
            }
        }

    }
}