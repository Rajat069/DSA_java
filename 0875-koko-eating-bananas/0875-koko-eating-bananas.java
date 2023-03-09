class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long min=1;
        long max=Long.MIN_VALUE;
        for(int i:piles){
            max=Math.max(max,i);
        }
        long sol=0;
        while(min<=max){
            long mid = (max+min)/2;
            long time=k_find(piles,mid);
            if(time<=h){
                sol=mid;
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return (int)sol;
        
    }
    public long k_find(int[] piles,long mid){
        long k_val=0;
        for(int i:piles){
            k_val+=(i/mid);
            k_val+=(i%mid!=0?1:0);
        }
        return k_val;
    }
  
}