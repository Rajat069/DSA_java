class Solution {
    public class pair{
        int freq;
        char c;
        pair(char c,int freq){
            this.c=c;
            this.freq=freq;
        }
    }
    public String reorganizeString(String s) {
        int[] freq = new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        PriorityQueue<pair>pq = new PriorityQueue<>((a,b)->(b.freq-a.freq));
        int idx=0;
        for(int i:freq){
            if(i>0){
                pair t= new pair((char)(idx+'a'),i);
                pq.add(t);
            }
            idx++;
        }
        StringBuilder sb= new StringBuilder();
        pair block=pq.poll();
        sb.append(block.c);
        block.freq--;
        while(!pq.isEmpty()){
            pair pr = pq.poll();
            sb.append(pr.c);
            pr.freq--;
            if(block.freq>0){
                pq.add(block);
            }
            block=pr;
        }
        return block.freq>0?"":sb.toString();
    }
}