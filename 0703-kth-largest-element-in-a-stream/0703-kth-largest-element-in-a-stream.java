class KthLargest {
    int k;
    PriorityQueue<Integer> pQueue;
    public KthLargest(int k, int[] nums) {
        pQueue=new PriorityQueue<Integer>();
        this.k=k;
        for(int i=0;i<nums.length;i++){
           pQueue.offer(nums[i]);
           if(pQueue.size()>k){
                pQueue.remove();
           } 
        }
    }
    
    public int add(int val) {
        pQueue.add(val);
        if(pQueue.size()>k){
            pQueue.remove();
        }
        return pQueue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */