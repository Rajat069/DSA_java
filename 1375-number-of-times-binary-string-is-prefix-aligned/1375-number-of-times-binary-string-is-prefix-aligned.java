class Solution {
    public int numTimesAllBlue(int[] flips) {
        int sol=0,idx=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));
        for(int i:flips){
            pq.offer(i);
            if(pq.peek()==idx+1){
               sol++;
            }
            idx++;
        }
        return sol;
    }
}