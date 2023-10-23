class Solution {
    public boolean isPowerOfFour(int n) {
        if(Integer.bitCount(n)>1||n==0)return false;
        int idx=0;
        while(n!=0){
            if(idx%2!=0&&((n&1)==1)){
                return false;
            }
            n>>=1;
            idx++;
        }
        return true;
    }
}