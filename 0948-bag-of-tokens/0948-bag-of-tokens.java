class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        if(tokens.length==0)return 0;
        if(tokens.length==1)return tokens[0]<=power?1:0;
        int maxsol=-1,sol=0,f=0,e=tokens.length-1;
        Arrays.sort(tokens);
        if(tokens[0]>power)return 0;
        while(f<=e){
            if(power>=tokens[f]){
                power-=tokens[f];
                sol++;
                f++;
            }
            else{
                power+=tokens[e];
                sol--;
                e--;
            }
            maxsol=Math.max(maxsol,sol);
        }
        return maxsol;
    }
}