class Solution {
    public int matrixSum(int[][] nums) {
        int score=0;
        for(int[]ar:nums){
            Arrays.sort(ar);
        }
        for(int i=nums[0].length-1;i>=0;i--){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<nums.length;j++){
                max=Math.max(max,nums[j][i]);
            }
            score+=max;
        }
        return score;
    }
}