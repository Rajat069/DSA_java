class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long sol=0;
        int max=total/cost1;
        for(int i=0;i<=max;i++){
            sol+=((total-(cost1*i))/cost2)+1;
        }
        return sol;
    }
}