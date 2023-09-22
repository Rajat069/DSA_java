class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        HashMap<Character,ArrayDeque<String>>hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i); 
            if(!hm.containsKey(ch)){
                ArrayDeque<String>temp=new ArrayDeque<>();
                hm.put(ch,temp);
            }
        }
        for(String w:words){
            char ch=w.charAt(0);
            if(hm.containsKey(ch)){
                hm.get(ch).offer(w);
            }
        }
        int sol=0;
        for(int i=0;i<s.length();i++){
            ArrayDeque<String>queue=hm.get(s.charAt(i));
            int size=queue.size();
            for(int j=0;j<size;j++){
                String t=queue.poll();
                if(t.length()==1){
                    sol++;
                }
                else{
                    if(hm.containsKey(t.charAt(1)))hm.get(t.charAt(1)).add(t.substring(1));
                }
            }
        }
        return sol;
    }
}