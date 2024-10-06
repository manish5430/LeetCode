class Solution {
    public int numIdenticalPairs(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i< nums.length; i++){
            for(int j=0; j< nums.length; j++){
            if( i< j && nums[i] == nums[j] ){
                list.add(i); list.add(j);
            }
            }
        }
        return (list.size() / 2);
    }
}