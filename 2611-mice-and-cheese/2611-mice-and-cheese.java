class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        PriorityQueue<Pair<Integer,Integer>>pq = new PriorityQueue<>((a,b)->{
            return b.getKey()-a.getKey();
        });
        for(int i=0;i<reward1.length;i++){
            Pair<Integer,Integer>pair1 = new Pair<>(reward1[i]-reward2[i],i);
            pq.offer(pair1);
        }
        HashSet<Integer>dontPick = new HashSet<>();
        int sol=0;
        while(k-->0){
            int idx=pq.poll().getValue();
            sol+=reward1[idx];
            dontPick.add(idx);
        }
        for(int i=0;i<reward2.length;i++){
            if(!dontPick.contains(i)){
                sol+=reward2[i];
            }
        }
        return sol;
    }
}