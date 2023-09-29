class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean pos=false,neg=false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]>0){
                pos=true;
            }
            else if(nums[i]-nums[i-1]<0)neg=true;
            if(pos&&nums[i]-nums[i-1]<0)return false;
            else if(neg&&nums[i]-nums[i-1]>0)return false;
        }
        return true;
    }
}