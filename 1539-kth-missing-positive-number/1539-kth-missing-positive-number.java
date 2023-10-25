class Solution {
    public int findKthPositive(int[] arr, int k) {
        boolean[]ar=new boolean[1001];
        for(int i:arr){
            ar[i-1]=true;
        }
        int val=-1;
        for(int i=0;i<=1000&&k!=0;i++){
            if(!ar[i]){
                val=i+1;
                k--;
            }
        }
        if(k!=0){
            return val+k;
        }
        return val;
    }
}