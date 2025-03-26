class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int[] row : grid){
            for(int val : row){
                list.add(val);
            }
        }
        Collections.sort(list);

        for(int num : list){
            if(Math.abs(num - list.get(0)) % x  !=  0){
                return -1;
            }
        }

        int median = list.get(list.size() /2);
        int ans = 0;

        for(int num : list){
            ans += Math.abs(num - median) /x;
        }
        
        return ans;
    }
}