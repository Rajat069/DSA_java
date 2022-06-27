class MyQueue {
        Stack<Integer> st =  new Stack<>();
        Stack<Integer> min =  new Stack<>();
    public MyQueue() {
       
    }
    
    public void push(int x) {
       st.push(x);
    }
    
    public int pop() {
        if(!st.isEmpty()){
             while(!st.isEmpty()){
            min.push(st.pop());
            }
            int val = min.pop();
            while(!min.isEmpty()){
            st.push(min.pop());
            }
          return val;
        }
        else return -1;
        
    }
    
    public int peek() {
         if(!st.isEmpty()){
             while(!st.isEmpty()){
            min.push(st.pop());
            }
            int val = min.peek();
            while(!min.isEmpty()){
            st.push(min.pop());
            }
          return val;
        }
        else return -1;
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */