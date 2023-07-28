class Solution {
    public boolean PredictTheWinner(int[] nums) {
        return Pwinner(0,nums.length-1,nums)>=0;
    }
    public int Pwinner(int l,int r,int[]nums){
        if(l==r){
            return nums[l];
        }
        int lscore=nums[l]-Pwinner(l+1,r,nums);
        int rscore=nums[r]-Pwinner(l,r-1,nums);
        return Math.max(lscore,rscore);
    }
}