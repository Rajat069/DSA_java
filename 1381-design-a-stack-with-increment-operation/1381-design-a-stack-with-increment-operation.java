class CustomStack {
   int[] ar;
   int tos;
    public CustomStack(int maxSize) {
      ar = new int[maxSize];
      tos = -1;  
    }
    
    public void push(int x) {
        if(tos!=ar.length-1){
            ar[++tos]=x;
        }
    }
    
    public int pop() {
        if(tos==-1){
            return -1;
        }
        else{
            return ar[tos--];
        }
    }
    
    public void increment(int k, int val) {
        if(ar.length<=k){
            for(int i=0;i<ar.length;i++){
                ar[i]+=val;
            }
        }
        else{
            for(int i = 0;i<k;i++){
                ar[i]+=val;
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */