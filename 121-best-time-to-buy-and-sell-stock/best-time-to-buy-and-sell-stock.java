class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for(int num : prices){
            min = Math.min( min, num);
            profit = Math.max( profit, num - min);
        }
        return profit;         
    }
}