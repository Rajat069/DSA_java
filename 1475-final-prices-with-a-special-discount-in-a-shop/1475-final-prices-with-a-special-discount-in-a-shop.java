class Solution {
    public int[] finalPrices(int[] prices) {
        int [] temp = new int[prices.length];
        Stack<Integer> st = new Stack<>();
        st.push(prices.length-1);
        temp[prices.length-1]=-1;
        for(int i=prices.length-2;i>-1;i--){
            while(!st.isEmpty()&&prices[st.peek()]>prices[i]){
                st.pop();
            }
            if(st.isEmpty()){
                temp[i]=-1;
            }
            else temp[i]=prices[st.peek()];
            st.push(i);
        }
        int[] ans = new int[prices.length];
        for(int i=0;i<prices.length;i++){
           if(temp[i]!=-1)ans[i]=prices[i]-temp[i];
           else ans[i]=prices[i];
        }
        return ans;
    }
}