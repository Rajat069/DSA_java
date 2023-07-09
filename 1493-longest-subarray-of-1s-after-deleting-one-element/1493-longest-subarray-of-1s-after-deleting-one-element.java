class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,zc=0;
        int maxlen=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                zc++;
            }
            if(zc>1){
                if(nums[l]==0)zc--;
                l++;
            }
            maxlen=Math.max(maxlen,r-l);
        }
        return maxlen;
    }
}