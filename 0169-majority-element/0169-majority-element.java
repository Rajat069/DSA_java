class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length/2;
        for(int i=0;i<nums.length;){
            int no=nums[i],c=0;
            while(i<nums.length&&no==nums[i]){
                c++;
                i++;
                if(c>len)return no;
            }
        }
        return -1;
    }
}