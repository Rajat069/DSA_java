class Solution {
    public long maxArrayValue(int[] nums) {
        long sol=0;
        Stack<Long>st= new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
                if(st.isEmpty()||st.peek()<nums[i]){
                    st.push(Long.valueOf(nums[i]));
                }
                else{
                     long temp = st.pop();
                     temp+=nums[i];
                     st.push(temp);
                   }
                sol=Math.max(st.peek(),sol);
          }
        return sol;
    }
}