class Solution {
    public int maximumCount(int[] nums) {
        int f=0,l=nums.length-1;
        while(f<=l){
            int mid=f+(l-f)/2;
            if(nums[mid]>=0){
                l=mid-1;
            }
            else{
                f=mid+1;
            }
        }
        int zr=0,temp=l+1;
        while(temp<nums.length&&nums[temp]==0){
            zr++;
            temp++;
        }
        return l+1>nums.length-l-1-zr?l+1:nums.length-l-1-zr;
    }
}