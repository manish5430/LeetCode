class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int num : prices){
            minPrice = Math.min(num, minPrice);
            maxProfit = Math.max(maxProfit, num - minPrice);
        }
        return maxProfit;
    }
}