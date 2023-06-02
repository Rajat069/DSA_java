class Solution {
    public class pair{ //creating custom class for pair
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
        PriorityQueue<pair>pq = new PriorityQueue<>((a,b)->(b.freq-a.freq)); //custom comparator that compare frequency
        int idx=0;
        for(int i:freq){
            if(i>0){
                pair t= new pair((char)(idx+'a'),i);
                pq.add(t);
            }
            idx++;
        }
        StringBuilder sb= new StringBuilder();
        pair block=pq.poll();  //remove and append the highest freq char
        sb.append(block.c);
        block.freq--;  //decrease freq
        while(!pq.isEmpty()){
            pair pr = pq.poll();
            sb.append(pr.c);
            pr.freq--;
            if(block.freq>0){  //if blocked character still has frequency left
                pq.add(block);
            }
            block=pr;//update blocking char to recently appended one
        }
        return block.freq>0?"":sb.toString();
    }
}