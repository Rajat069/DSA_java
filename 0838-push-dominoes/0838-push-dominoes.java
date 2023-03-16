class Solution {
    public String pushDominoes(String dominoes) {
        StringBuilder sb = new StringBuilder();
        int len = dominoes.length();
        int[] Netforce = new int[len];
        int force=0;
        for(int i=0;i<len;i++){
            char c = dominoes.charAt(i);
            if(c=='R'){
                force=len;
            }
            else if(c=='L'){
                force=0;
            }
            else{
                force=Math.max(force-1,0);
            }
            Netforce[i]+=force;
        }
         for(int i=len-1;i>=0;i--){
            char c = dominoes.charAt(i);
            if(c=='L'){
                force=len;
            }
            else if(c=='R'){
                force=0;
            }
            else{
                force=Math.max(force-1,0);
            }
            Netforce[i]-=force;
        }
        for(int i=0;i<len;i++){
            if(Netforce[i]>0)sb.append("R");
            else if(Netforce[i]<0)sb.append("L");
            else sb.append(".");
        }
        return sb.toString();
        
    }
}