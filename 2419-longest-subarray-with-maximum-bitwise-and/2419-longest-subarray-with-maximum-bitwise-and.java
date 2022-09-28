class Solution {
    public int longestSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            if(nums[i]>=max){
                if(nums[i]!=max){
                    count=0;
                }
                max= nums[i];
                boolean flag = false;
               while(i<nums.length&&nums[i]==max){
                   i++;
                   flag=true;
                   c++;
                }   
                if(flag)i--;
                count=Math.max(count,c);
            }
        }
        return count;
    }
}