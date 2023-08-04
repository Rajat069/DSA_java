class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        boolean[][] dp =new boolean[n][n];
        for(int g=0;g<s.length();g++){
            for(int i=0,j=g;j<s.length();i++,j++){ //diagonal traversal
                if(g==0){
                    dp[i][j]=true;
                }
                else if(g==1&&s.charAt(i)==s.charAt(j)){
                    dp[i][j]=true;
                }
                else{
                    if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]){
                        dp[i][j]=true;
                    }
                }
            }
        }
        int count=0;
         for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(dp[i][j])count++;
            }
         }
        return count;
    }
}