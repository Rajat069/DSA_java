class MyStack {
    Queue<Integer>queue;
    Queue<Integer>temp;
    public MyStack() {
        queue=new ArrayDeque<>();
        temp=new ArrayDeque<>();
    }
    
    public void push(int x) {
         queue.offer(x);         
    }
    
    public int pop() {
        if(queue.size()==1)return queue.poll();
        while(queue.size()!=1){
            temp.offer(queue.poll());
        }
        int val=queue.poll();
        while(!temp.isEmpty()){
            queue.offer(temp.poll());
        }
        return val;
    }
    
    public int top() {
         if(queue.size()==1)return queue.peek();
        while(queue.size()!=1){
            temp.offer(queue.poll());
        }
        int val=queue.poll();
        while(!temp.isEmpty()){
            queue.offer(temp.poll());
        }
        queue.offer(val);
        return val;
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */