class Solution {
    public int longestOnes(int[] nums, int k) {
        int zc=0,l=0,maxlen=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zc++;
            }
            if(zc>k){
                if(nums[l]==0)zc--;
                l++;
            }
            maxlen=Math.max(maxlen,i-l+1);
        }
        return maxlen;
    }
}