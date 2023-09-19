class Solution {
    public int findDuplicate(int[] nums) {
         boolean[] isSeen=new boolean[nums.length+1];
         for(int i=0;i<nums.length;i++){
             if(isSeen[nums[i]])return nums[i];
             isSeen[nums[i]]=true;
         }
        return -1;
    }
    
}