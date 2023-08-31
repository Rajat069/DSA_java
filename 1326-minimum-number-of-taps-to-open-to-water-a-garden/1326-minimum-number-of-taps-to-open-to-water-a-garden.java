class Solution {
    public int minTaps(int n, int[] ranges) {
        int min=0,max=0,tapsC=0;
        while(max<n){
            for(int idx=0;idx<ranges.length;idx++){
               if(idx-ranges[idx]<=min&&ranges[idx]+idx>=max){
                  max=idx+ranges[idx];
                }   
            }
            if(max==min)return -1;
            tapsC++;
            min=max;
        }
        return tapsC;
    }
}