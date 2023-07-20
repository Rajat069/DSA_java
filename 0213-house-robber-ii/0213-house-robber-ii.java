class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        else if(nums.length==2)return Math.max(nums[0],nums[1]);
        int[]inc = new int[nums.length]; 
        int[]exc = new int[nums.length]; 
        inc[0]=nums[0]; 
        for(int i=1;i<nums.length-1;i++){
            inc[i]=exc[i-1]+nums[i]; 
            exc[i]=Math.max(exc[i-1],inc[i-1]); 
        }
        int oneTo2ndlast=Math.max(inc[nums.length-2],exc[nums.length-2]);
        
        inc = new int[nums.length]; 
        exc = new int[nums.length]; 
        inc[1]=nums[1];
        for(int i=2;i<nums.length;i++){
            inc[i]=exc[i-1]+nums[i];  
            exc[i]=Math.max(exc[i-1],inc[i-1]); 
        }
        int secondTolast=Math.max(inc[nums.length-1],exc[nums.length-1]);
        return Math.max(oneTo2ndlast,secondTolast); 
    }
}