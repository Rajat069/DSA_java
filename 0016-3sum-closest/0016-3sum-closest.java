class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=nums[0]+nums[nums.length/2]+nums[nums.length-1];
        for(int i=0;i<nums.length-2;i++){
            int f=i+1;
            int l=nums.length-1;
            while(l>f){
                int cur_sum=nums[f]+nums[l]+nums[i];
                if(cur_sum==target){
                    return target;
                }
                else if(cur_sum>target){
                    l--;
                }
                else{
                    f++;
                }
              if(Math.abs(cur_sum-target)<Math.abs(res-target))res=cur_sum;
            }
          
        }
        return res;
    }
}