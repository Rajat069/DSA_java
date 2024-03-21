class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        return binS(nums,k);
    }
    public int binS(int[]ar,int tar){
        int f=0,l=ar.length-1;
        while(f<=l){
            int mid=(f+l)/2;
            if(ar[mid]<tar){
                f=mid+1;
            }
            else l=mid-1;
        }
        return f;
    }
}