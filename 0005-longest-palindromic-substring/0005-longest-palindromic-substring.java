class Solution {
    public String longestPalindrome(String s) {
        String sol="";
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int g=0;g<s.length();g++){
            for(int i=0,j=g;j<s.length();j++,i++){
                if(g==0){
                    dp[i][j]=true;
                }
                else if(g==1&&s.charAt(i)==s.charAt(j)){
                    dp[i][j]=true;
                }
                else if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]){
                    dp[i][j]=true;
                }
                else dp[i][j]=false;
                if(dp[i][j])sol=s.substring(i,j+1);
            }
        }
        return sol;
    }
}