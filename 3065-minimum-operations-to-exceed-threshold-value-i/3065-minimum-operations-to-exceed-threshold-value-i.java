class Solution {
    public int minOperations(int[] nums, int k) {
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      for(int i:nums){
          pq.offer(i);
      }
      int sol=0;  
      while(!pq.isEmpty()){
          if(pq.poll()>=k)return sol;
          sol++;
      }  
      return -1;
    }
}