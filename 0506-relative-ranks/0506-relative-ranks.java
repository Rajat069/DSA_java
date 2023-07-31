class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        int idx=0;
        for(int i:score){
            hm.put(i,idx);
            pq.offer(i);
            idx++;
        }
        String[] sol = new String[score.length];
        idx=0;
        String [] medalList = new String[3];
        medalList[0]="Gold Medal";
        medalList[1]="Silver Medal";
        medalList[2]="Bronze Medal";
        while(!pq.isEmpty()){
            if(idx<=2)sol[hm.get(pq.poll())] = medalList[idx];
            else sol[hm.get(pq.poll())] = String.valueOf(idx+1);
            idx++;
        }
        return sol;
    }
}