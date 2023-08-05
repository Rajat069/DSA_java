class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i:nums){
            pq.offer(i);
        }
        int[]sol = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sol[i]=pq.poll();
        }
        return sol;
    }
}