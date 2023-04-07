class MyCircularQueue {
    int[] ar;
    int f,r,size,cursize;
    public MyCircularQueue(int k) {
        ar=new int[k];
        f=0;
        r=-1;
        size=k;
        cursize=0;
    }
    
    public boolean enQueue(int value) {
       if(isFull())return false;
       ar[((++r)%size)]=value;
       cursize++;
       return true;
    }
    
    public boolean deQueue() {
       if(isEmpty())return false;
       f++;
       cursize--; 
       return true;
    }
    
    public int Front() {
        if(isEmpty())return -1;
        return ar[f%size];
    }
    
    public int Rear() {
        if(isEmpty())return -1;
        return ar[r%size];
    }
    
    public boolean isEmpty() {
        return cursize==0;
    }
    
    public boolean isFull() {
        return size==cursize;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */