class Solution {
    public int rob(int[] nums) {
        int[]inc = new int[nums.length];
        int[]exc = new int[nums.length];
        inc[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            inc[i]=exc[i-1]+nums[i];
            exc[i]=Math.max(exc[i-1],inc[i-1]);
        }
        return Math.max(inc[nums.length-1],exc[nums.length-1]);
    }
}