class Solution {
    public int minDeletion(int[] nums) {
        Stack<Integer>st = new Stack<>();
        int numDel=0;
        for(int i=0;i<nums.length;i++){
            if(st.isEmpty()){
                st.push(nums[i]);
            }
            else{
                if(st.peek()==nums[i]&&(st.size()-1)%2==0){
                    numDel++;
                }
                else st.push(nums[i]);
            }
        }
        if(st.size()%2!=0)numDel++;
        return numDel;
    }
}