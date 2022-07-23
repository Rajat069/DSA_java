class StockSpanner {
    int i=0;
    ArrayList<Integer> ar;
    Stack <Integer> st;
    public StockSpanner() {
         ar = new ArrayList<>();
         st = new Stack<>();
    }
    
    public int next(int price) {
        if(st.isEmpty()){
            ar.add(price);
            st.push(i++);
            return 1;
        }
        else{
                while(!st.isEmpty()&&ar.get(st.peek())<=price){
                    st.pop();
                }
                int ans = st.isEmpty()?i+1:i-st.peek();
                st.push(i);
                ar.add(price);
                i++;
                return ans;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */