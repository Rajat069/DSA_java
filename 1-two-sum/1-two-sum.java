class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            while(j<nums.length){
                if(nums[j]==target-nums[i]){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
                j++;
            }
        }
        return ans;
    }
}