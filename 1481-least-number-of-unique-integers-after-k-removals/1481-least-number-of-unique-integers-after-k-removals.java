class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->{
            return hm.get(a)-hm.get(b);
        });
        for(int i:hm.keySet()){
            pq.offer(i);
        }
        while(k-->0){
            int rem=pq.peek();
            int c=hm.get(rem);
            c--;
            if(c==0){
                pq.poll();
                hm.remove(rem);
            }else hm.put(rem,c);
        }
        return pq.size();
    }
}