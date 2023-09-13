class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((m*k)>bloomDay.length){
            return -1;
        }
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i:bloomDay){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        int fday=minHelper(bloomDay,m,k,min,max);
        return fday>max?-1:fday;
    }
    private int minHelper(int[]bloom,int m,int k,int f,int l){
        while(f<=l){
            int mid=f+(l-f)/2;
            if(AdjCheck(mid,bloom,m,k)){
                l=mid-1;
            }
            else f=mid+1;
        }
        return f;
    }
    private boolean AdjCheck(int days,int[]bloom,int m,int k){
        int adj=0,count=0;
        for(int i=0;i<bloom.length;i++){
             if(bloom[i]<=days){
                 adj++;
             }
             else{
                 adj=0;
             }
             if(adj==k){
                 count++;
                 adj=0;
             }
        }
        return count>=m;
    }
}