class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int num : prices){
            minPrice = Math.min(num, minPrice);
            maxProfit = Math.max(maxProfit, num - minPrice);
        }
        return maxProfit;
    }
}