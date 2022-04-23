class Solution {
    public int[] finalPrices(int[] prices) {
        int [] temp = new int[prices.length];
        Stack<Integer> st = new Stack<>();
        st.push(prices.length-1);
        temp[prices.length-1]=prices[prices.length-1];
        for(int i=prices.length-2;i>-1;i--){
            while(!st.isEmpty()&&prices[st.peek()]>prices[i]){
                st.pop();
            }
            if(st.isEmpty()){
                temp[i]=prices[i];
            }
            else temp[i]=prices[i]-prices[st.peek()];
            st.push(i);
        }
       
        return temp;
    }
}