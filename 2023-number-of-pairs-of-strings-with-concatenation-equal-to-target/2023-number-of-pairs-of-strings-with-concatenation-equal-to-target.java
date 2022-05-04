class Solution {
    public int numOfPairs(String[] nums, String target) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                     StringBuilder sb = new StringBuilder(nums[i]);
                sb.append(nums[j]);
                if(sb.toString().equals(target))ans++;
                }
            }
        }    
        return ans;
    }
}