class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i : nums){
            if( i % 2 == 0){
                list1.add(i);
            }else{
                list2.add(i);
            }
        }
        list1.addAll(list2);
        int[] ans = new int[list1.size()];
        for(int i = 0; i< ans.length; i++){
            ans[i] = list1.get(i);
        }

        return ans;

    }
}