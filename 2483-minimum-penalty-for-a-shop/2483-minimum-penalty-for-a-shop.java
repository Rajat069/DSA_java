class Solution {
    public int bestClosingTime(String customers) {
        int[]prefix = new int[customers.length()+1];
        int[]postfix = new int[customers.length()+1];
        int fpenalty=Integer.MAX_VALUE,sol=-1;
        prefix[0]=(customers.charAt(0)=='N'?1:0);
        for(int i=1;i<prefix.length-1;i++){
            prefix[i]=prefix[i-1]+(customers.charAt(i)=='N'?1:0);
        }
        prefix[prefix.length-1]=prefix[prefix.length-2];
        for(int i=customers.length()-1;i>=0;i--){
            postfix[i]=postfix[i+1]+(customers.charAt(i)=='Y'?1:0);
        }
        for(int i=0;i<customers.length()+1;i++){
            int penalty=0;
            if(i!=customers.length()){
                if(customers.charAt(i)=='N')penalty=-1;
                penalty+=prefix[i]+postfix[i];
            }
            else penalty=prefix[i];
            if(penalty<fpenalty){
                fpenalty=penalty;
                sol=i;
            }
        }
        return sol;
    }
}