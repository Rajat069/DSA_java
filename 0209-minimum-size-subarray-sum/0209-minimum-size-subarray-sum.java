class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int sum=0,f=0,e=0,winsize=Integer.MAX_VALUE;
       while(e<nums.length){
           sum+=nums[e++];
           while(sum>=target){
               winsize=Math.min(e-f,winsize);
               sum-=nums[f++];
           }
       }
       return winsize==Integer.MAX_VALUE?0:winsize; 
    }
}