class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st = new Stack<>();
        int[] ar = new int[temp.length];
        for(int i=temp.length-1;i>-1;i--){
            if(st.isEmpty()){
                st.push(i);
                ar[i]=0;
            }
            else{
                while(!st.isEmpty()&&temp[st.peek()]<=temp[i]){
                    st.pop();
                }
                if(st.isEmpty())ar[i]=0;
                else ar[i]=st.peek()-i;
                st.push(i);
            }
        }
        return ar;
    }
}