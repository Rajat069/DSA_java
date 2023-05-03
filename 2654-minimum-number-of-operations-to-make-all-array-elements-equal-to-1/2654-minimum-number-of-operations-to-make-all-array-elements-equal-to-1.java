class Solution {
    public int minOperations(int[] nums) {
        int onecount=0;
        for(int i:nums){
            if(i==1)onecount++;
        }
        if(onecount!=0)return nums.length-onecount;
        int sol=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int cur=0;
            for(int j=i;j<nums.length;j++){
               cur=gcd(cur,nums[j]);
               if(cur==1){
                   sol=Math.min(sol,j-i+nums.length-1);
                   break;
               } 
            }
        }
       return sol==Integer.MAX_VALUE?-1:sol;
    }
    static int gcd(int a,int b) //eculdeon theory for gcd
    {
        if(a==0) return b;
        return gcd(b%a,a);
    }
}