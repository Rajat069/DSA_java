class Solution {
    public int findMin(int[] nums) {
      int pvt=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
               pvt=i;
                break;
            }
        }
        if(pvt==-1)return binSearch(nums,0,nums.length,Integer.MIN_VALUE);
        return Math.min(binSearch(nums,0,pvt-1,Integer.MIN_VALUE),binSearch(nums,pvt,nums.length,Integer.MIN_VALUE));
    }
     public int binSearch(int[] nums,int f,int l,int tar){
         int mid=-1;
         while(f<=l){
            mid = f+(l-f)/2;
            if(nums[mid]>tar)l=mid-1;
            else f=mid+1;
        }
        return nums[mid];
    }
}