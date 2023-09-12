class Solution {
    public int minimumDeletions(int[] nums) {
       int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
       int mnidx=-1,mxidx=-1,idx=0;
       while(idx<nums.length){
           int num=nums[idx];
           if(num>max){
               max=num;
               mxidx=idx;
           }
           if(num<min){
               min=num;
               mnidx=idx;
           }
           idx++;
       }
        int fdif=Math.max(mnidx,mxidx)+1;
        int ldif=nums.length-Math.min(mnidx,mxidx);
        int mdif=nums.length+Math.min(mnidx,mxidx)-Math.max(mnidx,mxidx)+1;
        return Math.min(Math.min(fdif,ldif),mdif);
    }
}