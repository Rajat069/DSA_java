class Solution {
    public int triangularSum(int[] nums) {
        return sum(nums,nums.length-1);
    }
    public int sum(int[] nums,int p){
        if(p==0){
            return nums[0];
        }
        for(int i=0;i<p;i++){
            nums[i]=(nums[i]+nums[i+1])%10;
        }
        return sum(nums,p-1);
    }
}