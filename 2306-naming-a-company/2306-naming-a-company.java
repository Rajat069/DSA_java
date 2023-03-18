class Solution {
    public long distinctNames(String[] ideas) {
       HashSet<String> hs[] = new HashSet[26];
       for(int i=0;i<26;i++){
           hs[i]=new HashSet<>();
       }  
       for(String s:ideas){
           hs[s.charAt(0)-'a'].add(s.substring(1));
       } 
       long sol=0;
       for(int i=0;i<26;i++){
           for(int j=i+1;j<26;j++){
               long val =0;
               for(String s:hs[i]){
                   if(hs[j].contains(s))val++;
               }
               sol+=2*(hs[i].size()-val)*(hs[j].size()-val);
           }
       }
       return sol; 
    }
}