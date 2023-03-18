class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int i:nums){
            xor^=i;
        }
        xor&=-xor;
        int xor1 = 0,xor2 = 0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&xor)==0){
                xor1^=nums[i];
            }
            else{
                xor2^=nums[i];
            }
        }
        return new int[]{xor1,xor2};
    }
}