class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> sol = new ArrayList<>();
        int tWordl=0,cur=0;
        for(String w:words){
            tWordl+=w.length();
        }
        for(int i=0;i<words.length;){
            StringBuilder sb = new StringBuilder();
            int curlen=0;
            int wc=0;
            while(i<words.length){
                if((curlen+words[i].length())<=maxWidth){
                    sb.append(words[i]+"1");
                    curlen+=words[i].length()+1;
                    wc++;
                }
                else break;
                i++;
            }
            int tspace = maxWidth-curlen+wc;
            cur+=curlen-wc;
            if(cur==tWordl){
                StringBuilder sp = new StringBuilder();
                String[]ar = sb.toString().split("1");
                for(int q=0;q<ar.length;q++){
                    sp.append(ar[q]);
                    if(q==ar.length-1){
                        if(tspace!=0)sp.append(" ".repeat(tspace));
                    }
                    else sp.append(" ");
                    tspace--;
                }
                sol.add(sp.toString());
            }
            else{
                if(wc==1){
                    sol.add(sb.substring(0,sb.length()-1)+" ".repeat(tspace));
                }
                else if(tspace%(wc-1)==0){
                StringBuilder sp = new StringBuilder();
                String[]ar = sb.toString().split("1");
                int wspace = tspace/(ar.length-1==0?1:ar.length-1);
                for(String w:ar){
                    sp.append(w);
                    if(tspace>0)sp.append(" ".repeat(wspace));
                    tspace-=wspace;
                  }
                 sol.add(sp.toString());
                }   
                else{
                StringBuilder sp = new StringBuilder();
                String[]ar = sb.toString().split("1");
                int wspace = (tspace)/(ar.length-1==0?1:ar.length-1);
                if(ar.length==2)wspace--;    
                int et=tspace%(ar.length-1);   
                for(String w:ar){
                    sp.append(w);
                    if(et>0){
                     sp.append(" ".repeat(wspace+1));
                     tspace--;   
                    }
                    else if(tspace>0)sp.append(" ".repeat(wspace));
                    tspace-=wspace;
                    et--;
                   }
                  sol.add(sp.toString());
                 }   
            }
        }
        return sol;
    }
}