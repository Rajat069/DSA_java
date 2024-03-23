class Solution {
    public class Pair<A, B> {
    private A first;
    private B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Pair<?, ?> pair = (Pair<?, ?>) obj;
        return first.equals(pair.first) && second.equals(pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}

    public String lastNonEmptyString(String s) {
        HashMap<Character,ArrayList<Integer>>hm=new HashMap<>();
        int i=0;
        for(char ch:s.toCharArray()){
            if(hm.get(ch)==null){
                ArrayList<Integer>ar=new ArrayList<>();
                ar.add(i);
                hm.put(ch,ar);
            }
            else{
                hm.get(ch).add(i);   
            }
            i++;
        }
        int maxF=0;
        for(ArrayList<Integer> val:hm.values()){
            maxF=Math.max(maxF,val.size());
        }
        ArrayList<Pair<Character,Integer>>pos=new ArrayList<>();
        for(char ch:hm.keySet()){
            if(hm.get(ch).size()==maxF){
                ArrayList<Integer>p=hm.get(ch);
                pos.add(new Pair<>(ch,p.get(p.size()-1)));
            }
        }
        StringBuilder sb=new StringBuilder();
        sb.append("*".repeat(s.length()));
        for(Pair<Character,Integer>p:pos){
            sb.setCharAt(p.getSecond(),p.getFirst());
        }
        StringBuilder sol=new StringBuilder();
        for(int q=0;q<sb.length();q++){
            if(sb.charAt(q)!='*'){
                sol.append(sb.charAt(q));
            }
        }
        return sol.toString();
    }
}