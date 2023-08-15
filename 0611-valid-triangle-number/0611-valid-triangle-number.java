class Solution {
    public int triangleNumber(int[] nums) {
       int count=0;
       Arrays.sort(nums);
       for(int i=0;i<nums.length-2;i++){
           for(int j=i+1;j<nums.length-1;j++){
               for(int q=j+1;q<nums.length;q++){
                   if(nums[i]+nums[j]>nums[q])count++;
               }
           }
       }
      return count;
    }
}