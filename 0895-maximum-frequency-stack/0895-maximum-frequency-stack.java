class FreqStack {
    HashMap<Integer,Integer>hm;
    PriorityQueue<elem>pq;
    int c=0;
    class elem{
     int val;
     int freq;
     int idx;
     public elem(int val,int freq,int idx){
        this.val=val;
        this.freq=freq;
        this.idx=idx;
      }
    }
    public FreqStack() {
       hm= new HashMap<>();
       pq=new PriorityQueue<>((a,b)->{
           int f1=a.freq;
           int f2=b.freq;
           int order1=a.idx;
           int order2=b.idx;
           if(f1==f2){
               return order2-order1; 
           }
           return f2-f1;
       });
    }
    
    public void push(int val) {
        int v = hm.getOrDefault(val,0)+1;
        elem obj = new elem(val,v,c++);
        pq.offer(obj);
        hm.put(val,v);
    }
    
    public int pop() {
        elem topF=pq.poll();
        if(hm.get(topF.val)==1){
            hm.remove(topF.val);
        }
        else{
            hm.put(topF.val,hm.get(topF.val)-1);
        }
        return topF.val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */