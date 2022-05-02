class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles+bottle(numBottles,numExchange);
    }
    public int bottle(int bot,int ex){
        if(bot<ex)return 0;
        return bot/ex+bottle(bot/ex+bot%ex,ex);
    }
}