class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> hs = new HashMap<>();
        for(char c:s.toCharArray()){
            hs.put(c,hs.getOrDefault(c,0)+1);
        }
        PriorityQueue<Pair<Character,Integer>>pq = new PriorityQueue<>((a,b)->{
            return b.getValue()-a.getValue();
        });
        for(char c:hs.keySet()){
            int freq=hs.get(c);
            Pair<Character,Integer>pair = new Pair<>(c,freq);
            pq.offer(pair);
        }
        StringBuilder sb = new StringBuilder();
        char block='*';
        while(!pq.isEmpty()){
            Pair<Character,Integer>pair=pq.poll();
            char ap=pair.getKey();
            boolean f=false;
            if(pair.getKey()==block){
                if(pq.isEmpty())return "";
                Pair<Character,Integer>pair2=pq.poll();
                ap=pair2.getKey();
                if(pair2.getValue()>1){
                    pair2=new Pair<>(pair2.getKey(),pair2.getValue()-1);
                    pq.offer(pair2);   
                }
                f=true;
            }
            sb.append(ap);
            block=ap;
            if(f){
                pq.offer(pair);
            }
            else if(pair.getValue()>1){
                    pair=new Pair<>(pair.getKey(),pair.getValue()-1);
                    pq.offer(pair);   
            }
       }
        return sb.toString();
    } 
}