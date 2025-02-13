class Solution {
    public int maxProfit(int[] prices) {
            if (prices.length == 0) return 0;
            int maxPtofit = 0;
            int minPrice = prices[0];
            for (int i : prices) {
                maxPtofit = Math.max(maxPtofit, i - minPrice);
                minPrice = Math.min(minPrice, i);
            }
            return maxPtofit;
    }
}