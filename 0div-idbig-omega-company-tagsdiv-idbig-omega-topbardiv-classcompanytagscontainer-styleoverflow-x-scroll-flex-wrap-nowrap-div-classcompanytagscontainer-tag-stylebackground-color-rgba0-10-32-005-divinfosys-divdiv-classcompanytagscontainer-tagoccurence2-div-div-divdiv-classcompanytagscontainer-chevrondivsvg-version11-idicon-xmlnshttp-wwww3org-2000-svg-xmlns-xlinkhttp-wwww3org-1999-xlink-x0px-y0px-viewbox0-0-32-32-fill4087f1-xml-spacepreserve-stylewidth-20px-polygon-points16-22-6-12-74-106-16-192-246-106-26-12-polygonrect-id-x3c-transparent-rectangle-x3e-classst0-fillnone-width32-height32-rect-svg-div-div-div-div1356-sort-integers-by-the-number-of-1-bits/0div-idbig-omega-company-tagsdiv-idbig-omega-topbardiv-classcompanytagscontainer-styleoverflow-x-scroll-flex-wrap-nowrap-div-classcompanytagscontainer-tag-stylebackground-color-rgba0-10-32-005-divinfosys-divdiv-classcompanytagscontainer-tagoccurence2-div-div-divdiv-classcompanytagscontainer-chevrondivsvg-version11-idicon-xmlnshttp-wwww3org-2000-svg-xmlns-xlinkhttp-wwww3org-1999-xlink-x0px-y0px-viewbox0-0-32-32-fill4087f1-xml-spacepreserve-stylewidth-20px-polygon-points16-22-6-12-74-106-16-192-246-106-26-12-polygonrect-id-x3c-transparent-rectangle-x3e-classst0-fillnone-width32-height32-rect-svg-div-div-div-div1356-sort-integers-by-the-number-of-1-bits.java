class Solution {
    public int[] sortByBits(int[] arr) {
        int[]bitc = new int[arr.length];
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->{
            if(Integer.bitCount(a)==Integer.bitCount(b)){
                return a-b;
            }
           return Integer.bitCount(a)-Integer.bitCount(b); 
        });
        for(int i:arr){
            pq.offer(i);
        }
        int idx=0;
        while(idx<arr.length){
           bitc[idx++]=pq.poll();    
        }
        return bitc;
    }
}