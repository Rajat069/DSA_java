class Solution {
    public void sortColors(int[] nums) {
      int[] ar = new int[3];
      for(int i=0;i<nums.length;i++){
          ar[nums[i]]++;
      }
      int p =0;
      for(int i=0;i<3;i++){
          while(ar[i]--!=0){
              nums[p++]=i;
          }
      }  
    }
}