class Solution {
    public int pivotIndex(int[] nums) {
         int[]prefix = new int[nums.length+1];
         for(int i=1;i<prefix.length;i++){
             prefix[i]=prefix[i-1]+nums[i-1];
         }
         int[]postfix = new int[nums.length+1];
         for(int i=prefix.length-2;i>=0;i--){
             postfix[i]=postfix[i+1]+nums[i];
         }
         for(int i=0;i<nums.length;i++){
             if(prefix[i]==postfix[i+1])return i;
         }
        return -1;
    }
}