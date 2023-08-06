class Solution {
    public boolean canSplitArray(List<Integer> nums, int m) {
        int f=0;
        if(nums.size()<3)return true;
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)+nums.get(i+1)>=m){
                return true;
            }
        }
        return false;
    }
}