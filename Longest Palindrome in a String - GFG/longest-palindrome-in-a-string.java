//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        return LongestPal(S);
        
    }
    public static String LongestPal(String s){
        int n = s.length();
        String longest="";
        boolean[][] dp =new boolean[n][n];
        for(int g=0;g<s.length();g++){
            for(int i=0,j=g;j<s.length();i++,j++){ //diagonal traversal
                if(g==0){  // for cases of one length 
                    dp[i][j]=true;
                }
                else if(g==1&&s.charAt(i)==s.charAt(j)){  //two length
                    dp[i][j]=true;
                }
                else{
                    if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]){ //>2 here first and last should match also the s/w of current place
                        dp[i][j]=true;
                    }
                }
                if(dp[i][j]&&(j-i+1)>longest.length()){
                    longest=s.substring(i,j+1);
                }
            }
        }
        return longest;
    }    
    
}