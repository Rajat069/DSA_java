class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0,idx=0;idx<nums.length;i++){
            int num=nums[idx];
            while(idx<nums.length&&num==nums[idx]){
                idx++;
            }
            count++;
            nums[i]=nums[idx-1];
        }
        return count;
    }
}