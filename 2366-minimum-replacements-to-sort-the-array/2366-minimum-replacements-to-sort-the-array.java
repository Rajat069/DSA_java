class Solution {
    public long minimumReplacement(int[] nums) {
        long steps=0;
        int prev=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            int div = nums[i]/prev;
            if((nums[i])%prev!=0){
                div++;
                prev=nums[i]/div;
            }
            steps+=div-1;
        }
        return steps;
    }
}