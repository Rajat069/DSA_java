class SmallestInfiniteSet {
    PriorityQueue<Integer>pq;
    HashSet<Integer>hs;
    public SmallestInfiniteSet() {
        pq=new PriorityQueue<>();
        hs=new HashSet<>();
        for(int i=1;i<=1000;i++){
            pq.offer(i);
        }
    }
    
    public int popSmallest() {
        hs.add(pq.peek());
        return pq.poll();
    }
    
    public void addBack(int num) {
          if(hs.contains(num)){
              pq.offer(num);
              hs.remove(num);
          }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */