class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : nums){
            list.add(n*n);
        }
        Collections.sort(list);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}