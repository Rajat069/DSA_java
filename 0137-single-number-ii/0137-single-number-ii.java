class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        boolean flag=false;
        for(int i=0;i<nums.length;){
            int count=0,temp=nums[i];
            while(i<nums.length&&nums[i]==temp){
                count++;
                i++;
            }
            if(count!=3)return temp;
        }
        return -1;
    }
}