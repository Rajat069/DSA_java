class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median=nums.length%2==1?nums[nums.length/2]:(nums[nums.length/2]+nums[nums.length/2-1])/2;
        int sol=0;
        for(int i:nums){
            sol+=Math.abs(i-median);
        }
        return sol;
    }
}