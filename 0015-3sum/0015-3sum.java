class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans_list=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            int temp=nums[i];
            int f=i+1;
            int l=nums.length-1;
            while(f<l){
                int val=temp+nums[f]+nums[l];
                if(val==0){
                   List<Integer>ls=Arrays.asList(temp,nums[f],nums[l]);
                   ans_list.add(ls);
                   f++;
                   l--;
                   while(f<l&&nums[f]==nums[f-1])f++;
                   while(f<l&&nums[l]==nums[l+1])l--; 
                }
                else if(val>0){
                    l--;
                }
                else{
                    f++;
                }
            }
        }
        return ans_list;
    }
}