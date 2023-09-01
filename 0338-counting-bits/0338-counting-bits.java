class Solution {
    public int[] countBits(int n) {
        int[] bit_count = new int[n+1];
        for(int i=0;i<=n;i++){
            bit_count[i]=helper(i,bit_count);
        }
        return bit_count;
    }
    private int helper(int num,int[]ar){
        if(num==0||num==1)return num;
        if(ar[num]!=0)return ar[num];
        return num%2==0?helper(num/2,ar):helper(num/2,ar)+1;
    }
}