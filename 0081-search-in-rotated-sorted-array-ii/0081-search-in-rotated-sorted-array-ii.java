class Solution {
    public boolean search(int[] nums, int target) {
        int pvt=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
               pvt=i;
               break;
            }
        }
        boolean p1=binSearch(nums,0,pvt,target);
        return !p1?binSearch(nums,pvt,nums.length-1,target):p1;
    }
    public boolean binSearch(int[] nums,int f,int l,int tar){
        while(f<=l){
            int mid = f+(l-f)/2;
            if(nums[mid]==tar)return true;
            else if(nums[mid]>tar)l=mid-1;
            else f=mid+1;
        }
        return false;
    }
}