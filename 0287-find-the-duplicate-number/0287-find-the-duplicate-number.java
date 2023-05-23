class Solution {
    public int findDuplicate(int[] nums) {
         boolean[] isSeen=new boolean[nums.length];
         for(int i=0;i<nums.length;i++){
             if(isSeen[nums[i]-1])return nums[i];
             isSeen[nums[i]-1]=true;
         }
        return -1;
    }
    
}