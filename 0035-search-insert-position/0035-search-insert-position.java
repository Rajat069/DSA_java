class Solution {
    public int searchInsert(int[] nums, int target) {
        return bSearch(nums,target);
    }
    public int bSearch(int[]nums,int tar){
        int f=0,l=nums.length-1;
        while(f<=l){
            int mid=f+(l-f)/2;
            if(nums[mid]==tar){
                return mid;
            }
            else if(nums[mid]>tar){
                l=mid-1;
            }
            else f=mid+1;
        }
        return f;
    }
}