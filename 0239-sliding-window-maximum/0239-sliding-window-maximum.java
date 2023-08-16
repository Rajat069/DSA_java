class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       if(nums.length==0||k==0){
            return new int[0];
       }
        int[]sol = new int[nums.length-k+1];
       ArrayDeque<Integer>queue = new ArrayDeque<Integer>();
       for(int i=0;i<nums.length;i++){
           while(!queue.isEmpty()&&queue.peekFirst()<=i-k){
               queue.pollFirst();
           }
           while(!queue.isEmpty()&&nums[queue.peekLast()]<=nums[i]){
               queue.pollLast();
           }
           queue.addLast(i);
           if(i>=k-1){
               sol[i-k+1]=nums[queue.peekFirst()];
           }
       }
       return sol; 
    }
}
/*
 public int[] maxSlidingWindow(int[] nums, int k) {
       if(nums.length==0||k==0){
            return new int[0];
       }
       PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->nums[b]-nums[a]);
       for(int i=0;i<k;i++){
           pq.offer(i);
       }
       int[]sol = new int[nums.length-k+1];
       sol[0]=nums[pq.peek()];
       for(int i=k;i<nums.length;i++){
           int rem=i-k;
           pq.remove(rem);
           pq.offer(i);
           sol[i-k+1]=nums[pq.peek()];
       }
       return sol; 
    }
    TC:O(N logk);
*/