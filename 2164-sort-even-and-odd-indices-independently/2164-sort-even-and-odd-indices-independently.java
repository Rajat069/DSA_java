class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int len = nums.length%2==0?nums.length/2:nums.length/2+1;
        int even[] = new int[len];
        int odd[] = new int[nums.length/2];
        int p1=0,p2=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even[p1]=nums[i];
                p1++;
            }
            else {
            odd[p2]=nums[i];
                p2++;
            }    
        }
        Arrays.sort(even);
        p1=0;
        p2-=1;
        Arrays.sort(odd);
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                ans[i]=even[p1];
                p1++;
            }
            else {
                ans[i]=odd[p2];
                p2--;
            }
        }
        return ans;
    }
}