class Solution {
    public boolean isMatch(String s, String p) {
        return Match(s,p);
    }
    public boolean Match(String s,String p){
        boolean[][]mat = new boolean[p.length()+1][s.length()+1];
        mat[p.length()][s.length()]=true;
        for(int i=p.length()-1;i>=0;i--){
            for(int j=s.length();j>=0;j--){ 
                // in last collumn all are false except * where we need to check below
                if(j==s.length()){
                    if(p.charAt(i)=='*'){
                        mat[i][j]=mat[i+1][j];
                    }
                }
                else{
                    if(p.charAt(i)=='*'){ // check below and to the right
                        mat[i][j]=mat[i][j+1]||mat[i+1][j];
                    }
                    else if(p.charAt(i)=='?'||p.charAt(i)==s.charAt(j)){  //check diagonally as ? matched current and rest depends upon later part or  if both character matches then check digaonally
                        mat[i][j]=mat[i+1][j+1];
                    }
                }
            }
        }
        return mat[0][0];
    }
}