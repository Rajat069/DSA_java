class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> sol = new ArrayList<>(); 
        for(int i=0;i<nums.length;i++){
            boolean flag=false;
            StringBuilder sb = new StringBuilder(String.valueOf(nums[i]));
            while(i<nums.length-1&&nums[i]+1==nums[i+1]){
                i++;
                flag=true;
            }
            if(flag){
                sb.append("->"+String.valueOf(nums[i]));
            }
            sol.add(sb.toString());
        }
        return sol;
    }
}