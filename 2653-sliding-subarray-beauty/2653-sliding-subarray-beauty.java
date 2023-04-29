class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
          int[] count = new int[50];
          int[] sol = new int[nums.length-k+1];
          int i=0;
          for(;i<k;i++){
              if(nums[i]<0)count[nums[i]+50]++;
          }
          int l=0,val=0;
          for(int q=0;q<50;q++){
                  l+=count[q];
                  if(l>=x){
                      val=q-50;
                      break;
                  }
          }
          sol[0]=val;
          int idx=1;
          for(;i<nums.length;i++){
              if(nums[idx-1]<0)count[nums[idx-1]+50]--;
              if(nums[i]<0)count[nums[i]+50]++;
              int loc=0,v=0;
              for(int q=0;q<50;q++){
                  loc+=count[q];
                  if(loc>=x){
                      v=q-50;
                      break;
                  }
              }
              sol[idx++]=v;
          }
        return sol;
    }
}