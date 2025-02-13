class Solution {
    public int maxProfit(int[] prices) {
            if (prices.length == 0) return 0;
            int maxPtofit = 0;
            int minPrice = prices[0];
            for (int i : prices) {
                if (maxPtofit < i - minPrice) maxPtofit = i - minPrice;
                if (minPrice > i) minPrice = i;
            }
            return maxPtofit;
    }
}