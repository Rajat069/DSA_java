class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        long sol = 0;
        PriorityQueue<Integer> lpq = new PriorityQueue<>();
        PriorityQueue<Integer> rpq = new PriorityQueue<>();
        int p1=0,p2=costs.length-1;
        for(int i=0;i<candidates;i++){
            if(p1<=p2)lpq.offer(costs[p1++]);
            if(p1<=p2)rpq.offer(costs[p2--]);
        }
        for(int i=0;i<k;i++){
           while(lpq.size()<candidates&&p1<=p2){
               lpq.offer(costs[p1++]);
           }
           while(rpq.size()<candidates&&p1<=p2){
               rpq.offer(costs[p2--]);
           }
           int lval=lpq.size()==0?Integer.MAX_VALUE:lpq.peek();
           int rval=rpq.size()==0?Integer.MAX_VALUE:rpq.peek();
           if(lval<=rval){
               sol+=lval;
               lpq.poll();
           } 
           else{
               sol+=rval;
               rpq.poll();
           }  
       }
    return sol;
  }   
}