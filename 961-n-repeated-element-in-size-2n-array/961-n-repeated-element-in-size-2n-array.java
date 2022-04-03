class Solution {
    public int repeatedNTimes(int[] nums) {
       int k= nums.length/2;
        Arrays.sort(nums);
        int counter=1;
       for(int i=0;i<=nums.length-1;i++){
            while(i<nums.length-1&&nums[i]==nums[i+1]){
                counter++;
                i++;
            }
           if(counter==k)return nums[i];
       }
        return 0;     
    }
}