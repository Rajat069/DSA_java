class Solution {
    public boolean isMatch(String s, String p) {
        return Match(s,p);
    }
    public boolean Match(String s,String p){
        boolean[][]mat = new boolean[p.length()+1][s.length()+1];
        for(int i=p.length();i>=0;i--){
            for(int j=s.length();j>=0;j--){
                if(i==p.length()&&j==s.length()){
                    mat[i][j]=true;
                }
                else if(i==p.length()){
                    mat[i][j]=false;
                }
                else if(j==s.length()){
                    if(p.charAt(i)=='*'){
                        mat[i][j]=mat[i+1][j];
                    }
                    else  mat[i][j]=false;
                }
                else{
                    if(p.charAt(i)=='*'){
                        mat[i][j]=mat[i][j+1]||mat[i+1][j];
                    }
                    else if(p.charAt(i)=='?'){
                        mat[i][j]=mat[i+1][j+1];
                    }
                    else if(p.charAt(i)==s.charAt(j)){
                        mat[i][j]=mat[i+1][j+1];
                    }
                    else mat[i][j]=false;
                }
            }
        }
        return mat[0][0];
    }
}