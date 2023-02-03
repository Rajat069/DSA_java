class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<String>dupli_checker=new HashSet<>();
        List<List<Integer>> ans_list=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            int temp=nums[i];
            int f=i+1;
            int l=nums.length-1;
            while(f<l){
                int val=temp+nums[f]+nums[l];
                if(val==0){
                   List<Integer>ls=Arrays.asList(temp,nums[f],nums[l]);
                   String dup=ls.toString();
                   if(!dupli_checker.contains(dup)){
                        ans_list.add(ls); 
                   }
                   dupli_checker.add(dup); 
                   f++;
                   l--;
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