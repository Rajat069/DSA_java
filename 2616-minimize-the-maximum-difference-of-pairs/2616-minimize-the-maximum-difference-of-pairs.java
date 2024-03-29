class Solution {
    public int minimizeMax(int[] nums, int p) {
        if(p==0)return 0;
        Arrays.sort(nums);
        int f=0,l=nums[nums.length-1]-nums[0];
        while(f<=l){
            int mid = f+(l-f)/2;
            int count=0,i=1;
            while(i<nums.length){
                if(nums[i]-nums[i-1]<=mid){
                    i++;
                    count++;
                }
                if(count==p)break;
                i++;
            }
            if(count==p){
                l=mid-1;
            }
            else f=mid+1;
        }
        return f;
    }
}