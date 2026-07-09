class Solution {
    public int maxProfit(int[] prices) {
        int maxPr = 0;

        int l = 0;
        int r = 1;

        while (l <= r && r < prices.length ){
            if(prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                maxPr = Math.max(maxPr, profit);
            }
            else{
                l = r;
            }
            r++;
        }
        return maxPr;
    }
}
