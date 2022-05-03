class Solution {
    public int arraySign(int[] nums) {
        Arrays.sort(nums);
        int neg = 0;
        int i=0;
        while(i<nums.length&&nums[i]<0){
            neg++;
            i++;
        }
        if(i<nums.length&&nums[i]!=0&&neg%2==0){
            return 1;
        }
        else if(i<nums.length&&nums[i]==0)return 0;
        else return -1;
        
    }
}