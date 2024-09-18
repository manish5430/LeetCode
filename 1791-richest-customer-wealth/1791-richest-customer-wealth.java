class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int[] person : accounts){
            int personWealth = 0;
            for(int wealth : person){
              personWealth = personWealth + wealth;
            }
            maxWealth = Math.max(maxWealth, personWealth);
        }
        return maxWealth;
    }
    
}