class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int n1 : nums){
            arr.add(n1);
        }
        for(int n2 : nums){
            arr.add(n2);
        }
        int[] ans = new int[arr.size()];
        for(int i=0; i<ans.length; i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}