class Solution {
    public int search(int[] nums, int target) {
       int pvt=-1;
       for(int i=1;i<nums.length;i++){
           if(nums[i]<nums[i-1]){
               pvt=i-1;
               break;
           }
       } 
       if(pvt==-1){
           return bsearch(nums,0,nums.length-1,target);
       } 
       int bsearch1 = bsearch(nums,0,pvt,target); 
       return bsearch1 == -1?bsearch(nums,pvt+1,nums.length-1,target):bsearch1;
    }
    public int bsearch(int[]ar,int f,int l,int tar){
        while(f<=l){
            int mid = f + (l-f)/2;
            if(tar==ar[mid])return mid;
            else if(tar>ar[mid])f=mid+1;
            else l=mid-1;
        }
        return -1;
    }
}