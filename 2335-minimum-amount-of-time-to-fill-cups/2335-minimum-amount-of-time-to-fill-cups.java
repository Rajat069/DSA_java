class Solution {
    public int fillCups(int[] amount) {
        int time=0;
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->{
            return b-a;
        });
        for(int i:amount){
            pq.offer(i);
        }
        if(pq.peek()==0)return 0;
        while(pq.size()!=1&&!pq.isEmpty()){
            int p1=pq.poll();
            int p2=pq.poll();
            time++;
            if(p1-1>0){
                pq.offer(p1-1);
            }
            if(p2-1>0){
                pq.offer(p2-1); 
            }
        }
        return time+(!pq.isEmpty()?pq.peek():0);
    }
}