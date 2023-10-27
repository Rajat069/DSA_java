class Solution {
    public String longestPalindrome(String s) {
        String sol="";
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int g=0;g<s.length();g++){
            for(int i=0,j=g;j<s.length();j++,i++){ // starting from g to only include upper traingle region of a 2d matrix
                if(g==0){  // where gap is 0 means same character mapped eh. a , b 
                    dp[i][j]=true;
                }
                else if(g==1&&s.charAt(i)==s.charAt(j)){ // where gap is 1 it is a two length character and can only be palind if both are same
                    dp[i][j]=true;
                }
                else if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]){ // here edge case should be same and also bottom left diagonal should be true
                    dp[i][j]=true;
                }
                else dp[i][j]=false;
                if(dp[i][j])sol=s.substring(i,j+1); //udating string length
            }
        }
        return sol;
    }
}