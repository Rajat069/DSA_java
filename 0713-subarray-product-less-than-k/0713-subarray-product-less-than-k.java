class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int sol=0,cur=1,l=0;
        if(k<2)return 0;
        for(int r=0;r<nums.length;r++){
            cur*=nums[r];
            while(l<=r&&cur>=k){
                cur/=nums[l++];
            }
            sol+=r-l+1;
        }
        return sol;
    }
}