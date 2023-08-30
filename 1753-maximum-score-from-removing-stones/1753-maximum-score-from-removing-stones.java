class Solution {
    public int maximumScore(int a, int b, int c) {
        int max=0;
        PriorityQueue<Integer>pq = new PriorityQueue<>((p1,p2)->{
            return p2-p1;
        });
        pq.offer(a);
        pq.offer(b);
        pq.offer(c);
        while(pq.size()>1){
             int v1 = pq.poll(),v2=-1;
             if(!pq.isEmpty())v2 = pq.poll();
             if(v1-1>=1)pq.offer(v1-1);
             if(v2-1>=1)pq.offer(v2-1);
             max++;
        }
        return max;
    }
}