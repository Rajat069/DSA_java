class Solution {
    public int maxOperations(int[] nums, int k) {
        int c=0;
        Arrays.sort(nums);
        int p1=0,p2=nums.length-1;
        while(p1<p2){
            if(nums[p1]+nums[p2]==k){
                p1++;
                p2--;
                c++;
            }
            else if(nums[p1]+nums[p2]>k){
                p2--;
            }
            else p1++;
        }
        return c;
    }
}