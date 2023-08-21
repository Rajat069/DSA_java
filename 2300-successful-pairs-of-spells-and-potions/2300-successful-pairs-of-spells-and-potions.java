class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
       Arrays.sort(potions);
       int id=0;
       int[]sol=  new int[spells.length];
       for(int i:spells){
            int idx = BinSearch(potions,0,potions.length-1,success,i);
            sol[id++]=potions.length-idx;
       }
        return sol;
    }
    private int BinSearch(int[]ar,int l,int h,long tar,int pot){
        while(l<=h){
            int mid = l+(h-l)/2;
            if((long)(ar[mid]*(long)pot)>=tar){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}