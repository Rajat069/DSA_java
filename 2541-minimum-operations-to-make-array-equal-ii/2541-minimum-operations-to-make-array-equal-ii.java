class Solution {
    public long minOperations(int[] nums1, int[] nums2, int k) {
        if(k==0){
            for(int i=0;i<nums1.length;i++){
                if(nums1[i]!=nums2[i])return -1;
            }
            return 0;
        }
        long inc=0,dec=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]>nums2[i]){
                if((nums1[i]-nums2[i])%k==0){
                    dec+=(nums1[i]-nums2[i])/k;
                }
                else return -1;
            }
            else if(nums2[i]>nums1[i]){
                 if((nums2[i]-nums1[i])%k==0){
                    inc+=(nums2[i]-nums1[i])/k;
                }
                else return -1;
            }
        }
        return Math.abs(inc-dec)!=0?-1:inc>dec?inc:dec;
    }
}