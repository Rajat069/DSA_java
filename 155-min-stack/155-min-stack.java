class MinStack {
        Stack<Integer> alldt= new Stack<>();
        Stack<Integer> mindt = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        alldt.push(val);
        if(mindt.size()==0||val<=mindt.peek()){
            mindt.push(val);
        }
    }
    
    public void pop() {
        int val = alldt.pop();
        if(val==mindt.peek()){
            mindt.pop();
        }
    }
    
    public int top() {
        return alldt.peek();
    }
    
    public int getMin() {
        return mindt.peek();
        
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