class Solution {
    public void nextPermutation(int[] nums) {
        int len=nums.length;
        int p1=len-2;
        int p2=len-1;
        while(p1>=0&&nums[p1]>=nums[p1+1]){
            p1--;
        }
        if(p1==-1){
            reverse(nums,0,len-1);
        }
        else{
            while(p2>=0&&nums[p1]>=nums[p2]){
                p2--;
            }
            int temp=nums[p1];
            nums[p1]=nums[p2];
            nums[p2]=temp;
            reverse(nums,p1+1,len-1);
        }
    }
    public static void reverse(int []rev,int f,int l){
        while(f<l){
            int temp = rev[f];
            rev[f]=rev[l];
            rev[l]=temp;
            f++;
            l--;
        }
    }
}