class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length-1;i++){
            int sidx=binsearch(numbers,i+1,target-numbers[i]);
            if(sidx!=-1)return new int[]{i+1,sidx+1};
        }
        return new int[]{-1,-1};
    }
    public int binsearch(int[] nums,int start,int tar){
        int f=start,l=nums.length-1;
        while(f<=l){
            int mid = f+(l-f)/2;
            if(tar==nums[mid])return mid;
            else if(tar>nums[mid])f=mid+1;
            else l=mid-1;
        }
        return -1;
    }
}