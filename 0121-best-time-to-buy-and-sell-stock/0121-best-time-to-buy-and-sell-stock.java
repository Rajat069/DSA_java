class Solution {
    public int maxProfit(int[] prices) {
       int[] buy = new int[prices.length];
       int[] sell = new int[prices.length];
       int by=prices[0];
       int sl=prices[prices.length-1];
       for(int i=0;i<prices.length;i++){
           by=Math.min(prices[i],by);
           buy[i]=by;
       }
       for(int i=prices.length-1;i>=0;i--){
           sl=Math.max(prices[i],sl);
           sell[i]=sl;
       }
       System.out.println(Arrays.toString(sell));
       int profit=0;
       for(int i=0;i<prices.length;i++){
           profit=Math.max(profit,Math.abs(sell[i]-buy[i]));
       } 
       return profit;
    }
}