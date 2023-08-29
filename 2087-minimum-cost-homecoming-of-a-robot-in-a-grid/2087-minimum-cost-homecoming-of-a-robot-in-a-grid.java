class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int sr=startPos[0],sc=startPos[1];
        int er=homePos[0],ec=homePos[1];
        int cost=0;
        int startr=sr>er?er:sr;
        int endr=sr>er?sr:er;
        if(startr==homePos[0]){
            cost+=rowCosts[startr];
            cost-=rowCosts[endr];
        }
        for(int i=startr+1;i<=endr;i++){
             cost+=rowCosts[i];
        }
        int startc=sc>ec?ec:sc;
        int endc=sc>ec?sc:ec;
        if(startc==homePos[1]){
            cost+=colCosts[startc];
            cost-=colCosts[endc];
        }
        for(int i=startc+1;i<=endc;i++){
             cost+=colCosts[i];
        }   
        return cost;
    }
}