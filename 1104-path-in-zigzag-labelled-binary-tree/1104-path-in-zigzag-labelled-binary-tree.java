class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer>ls = new ArrayList<>();
        if(label==1){
           ls.add(1);
           return ls; 
        }
        int lvl=0,TwoP=0,idx=0,og=label;
        while(TwoP<label){
            TwoP+=Math.pow(2,lvl++);
        }
        lvl-=2;
        while(lvl>=0){
            int pow=(int)Math.pow(2,lvl+1),prev=0,plabel=0;
            if(lvl%2==0){
                prev=(pow*2)-label-1;
                plabel=(pow/2)+(prev/2);
                ls.add(plabel);
            }
            else{
                prev=(pow*2)-1-label;
                plabel=(prev/2)+(pow/2);
                ls.add(plabel);
                
            }
            label=ls.get(idx++);
            lvl--;
        }
        Collections.reverse(ls);
        ls.add(og);
        return ls;
    }
}