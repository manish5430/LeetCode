class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums){
            list.add(i*i);
        }
        int[] ans = new int[list.size()];
        for(int i=0; i< ans.length; i++){
            ans[i] = list.get(i);
        }
        Arrays.sort(ans);
        return ans;

    }
}