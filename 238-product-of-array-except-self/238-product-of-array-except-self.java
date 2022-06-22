class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        for(int i=0,count=1;i<nums.length;i++){
            pre[i]=count*nums[i];
            count=pre[i];
        }
        for(int j=nums.length-1,count=1;j>-1;j--){
            post[j]=count*nums[j];
            count=post[j];
        }
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                ans[i]=post[i+1];
            }
            else if(i==nums.length-1){
                ans[i]=pre[i-1];
            }
            else {
                ans[i]=pre[i-1]*post[i+1];
            }
        }
        return ans;
    }
}