class Solution {
    public int arrangeCoins(int n) {
        if(n==1||n==2)return 1;
        if(n==3)return 2;
        
        long f=2,l=n/2;
        while(f<=l){
            long mid=f+(l-f)/2;
            long sol=mid*(mid+1)/2;
            if(sol==n)return (int)mid;
            else if(sol>n){
                l=mid-1;
            }
            else f=mid+1;
        }
        return (int)l;
    }
}