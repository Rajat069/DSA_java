class Solution {
    public int minimizeMax(int[] nums, int p) {
        if(p==0)return 0;
        int f=0,l=1000000000;
        Arrays.sort(nums);
        while(f<=l){
            int mid = f+(l-f)/2;
            int count=0;
            for(int i=1;i<nums.length;i++){
                if(nums[i]-nums[i-1]<=mid){
                    i++;
                    count++;
                }
                if(count==p)break;
            }
            if(count==p){
                l=mid-1;
            }
            else f=mid+1;
        }
        return f;
    }
}