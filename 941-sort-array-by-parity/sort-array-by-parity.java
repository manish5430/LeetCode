class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : nums){
            if(n %2 == 0){
                list.add(n);
            }
        }
        for(int n : nums){
            if( n%2 != 0){
                list.add(n);
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i< ans.length; i++){
            ans[i] = list.get(i);
        }

        return ans;        
    }
}