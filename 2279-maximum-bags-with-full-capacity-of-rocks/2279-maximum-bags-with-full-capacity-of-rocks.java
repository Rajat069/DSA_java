class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        PriorityQueue<Pair<Integer,Integer>>pq = new PriorityQueue<>((a,b)->{
            return (a.getKey()-a.getValue())-(b.getKey()-b.getValue());
        });
        int r=0;
        for(int cap:capacity){
            Pair<Integer,Integer>pair = new Pair<>(cap,rocks[r++]);
            pq.offer(pair);
        }
        r=0;
        int count=0;
        while(!pq.isEmpty()){
            Pair<Integer,Integer>pair=pq.poll();
            if(pair.getKey()==pair.getValue()){
                  count++;
                  continue;
            }
            else if(pair.getKey()-pair.getValue()<=additionalRocks){
                count++;
                additionalRocks-=pair.getKey()-pair.getValue();
            }
        }
        return count;
    }
}