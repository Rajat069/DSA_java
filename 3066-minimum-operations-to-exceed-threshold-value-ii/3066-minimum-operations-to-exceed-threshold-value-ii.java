class Solution {
    public int minOperations(int[] nums, int k) {
       PriorityQueue<Long> pq = new PriorityQueue<>();
       for(int i:nums){
          pq.offer((long)i);
       }
       int op=0; 
       while(pq.size()>=2&&pq.peek()<k){
           long num1=pq.poll();
           long num2=pq.poll();
           long newN=(long)(num1*2)+num2;
           pq.offer(newN);
           op++;
       } 
      return op;
    }
}