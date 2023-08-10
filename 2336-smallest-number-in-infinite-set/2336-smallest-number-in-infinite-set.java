class SmallestInfiniteSet {
    PriorityQueue<Integer>pq;
    int curMin=1;
    public SmallestInfiniteSet() {
        pq=new PriorityQueue<>();
    }
    
    public int popSmallest() {
        if(!pq.isEmpty()){
            return pq.poll();
        }
        return curMin++;
    }
    
    public void addBack(int num) {
          if(!pq.contains(num)&&num<curMin){ //expensive
              pq.offer(num);
          }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */