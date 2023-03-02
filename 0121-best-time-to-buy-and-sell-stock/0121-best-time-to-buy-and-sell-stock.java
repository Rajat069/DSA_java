class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int least_s=prices[0];
        for(int i:prices){
            if(least_s>i){
                least_s=i;
            }
            profit=Math.max(i-least_s,profit);
        }
        return profit;
    }
}