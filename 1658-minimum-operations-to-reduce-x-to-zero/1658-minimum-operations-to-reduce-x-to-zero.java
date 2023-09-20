class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int tar=sum-x,cursum=0,sol=-1;
        for(int l=0,r=0;r<nums.length;r++){
            cursum+=nums[r];
            while(l<=r&&cursum>tar){
                cursum-=nums[l++];
            }
            if(cursum==tar){
                sol=Math.max(sol,r-l+1);
            }
        }
        return sol==-1?-1:nums.length-sol;
    }
}