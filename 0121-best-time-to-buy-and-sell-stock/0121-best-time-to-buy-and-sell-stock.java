class Solution {
    public int maxProfit(int[] prices) {
        int[] max= new int[prices.length];
        int cur=prices[prices.length-1];
        for(int i=prices.length-1;i>=0;i--){
            cur=Math.max(cur,prices[i]);
            max[i]=cur;
        }
        System.out.println(Arrays.toString(max));
        int sol=-1;
        for(int i=0;i<prices.length;i++){
            sol=Math.max(max[i]-prices[i],sol);
        }
        return sol;
    }
}