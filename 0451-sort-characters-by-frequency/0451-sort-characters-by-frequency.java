class Solution {
    public String frequencySort(String s) {
        PriorityQueue<Pair<Character,Integer>>pq = new PriorityQueue<>((a,b)->{
            if(a.getValue()==b.getValue()){
                return a.getKey()-b.getKey();
            }
            else return b.getValue()-a.getValue();
        });
        HashMap<Character,Integer>hm=new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(char c:hm.keySet()){
            Pair<Character,Integer>pairr=new Pair<>(c,hm.get(c));
            pq.offer(pairr);
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Pair<Character,Integer>temp=pq.poll();
            String ss=temp.getKey()+"";
            StringBuilder word = new StringBuilder();
            for(int i=0;i<temp.getValue();i++){
               word.append(ss);
            }
            sb.append(word.toString());
        }
        return sb.toString();
    }
}