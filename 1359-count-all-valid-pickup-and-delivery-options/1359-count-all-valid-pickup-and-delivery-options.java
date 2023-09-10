class Solution {
    public int countOrders(int n) {
        int avSlots=n*2;
        int mod=1000000007;
        long sol=1;
        while(avSlots>0){
            int validC=((avSlots*(avSlots-1))%mod)/2;
            sol=((sol%mod)*validC)%mod;
            avSlots-=2;
        }
        return (int)sol;
    }
}