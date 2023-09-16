class MinStack {
    Stack<Integer>st = new Stack<>();
    PriorityQueue<Integer>pq=new PriorityQueue<>();
    public MinStack() {
        
    }
    public void push(int val) {
        st.push(val);
        pq.offer(val);
    }
    
    public void pop() {
        int popv=st.pop();
        pq.remove(popv);
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return pq.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */