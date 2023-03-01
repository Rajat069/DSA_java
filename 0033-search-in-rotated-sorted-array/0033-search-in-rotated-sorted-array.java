class Solution {
    public int search(int[] nums, int target) {
        int pvt =0;
        int max=Integer.MIN_VALUE;
        int idx=0;
        for(int i:nums){
            if(i>max){
                pvt=idx;
                max=i;
            }
            idx++;
        }
        System.out.println(pvt);
        int val=bsearch(nums,0,pvt,target);
        return val==-1?bsearch(nums,pvt+1,nums.length-1,target):val;
        
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