//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} 
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int maxGold(int n,int m,int[][] M) {
        if(n==1){
            int maxGOLD = 0;
            for (int i = 0; i < M[0].length; i++) {
            maxGOLD+=M[0][i];
          }
          return maxGOLD;
        }
        else if(m==1){
        int maxGOLD = 0;
        for (int i = 0; i < M.length; i++) {
            maxGOLD = Math.max(maxGOLD, M[i][0]);
         }
        }
        return MAX_LOOT(M);
    }

       public static int MAX_LOOT(int[][] ar) {
        int[][] dp = new int[ar.length][ar[0].length];
        for (int j = ar[0].length - 1; j >= 0; j--) {
            for (int i = ar.length - 1; i >= 0; i--) {
                if (j == ar[0].length - 1) {
                    dp[i][j] = ar[i][j];
                } else if (i == 0) {
                    dp[i][j] = ar[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]);
                } else if (i == ar.length - 1) {
                    dp[i][j] = ar[i][j] + Math.max(dp[i][j + 1], dp[i - 1][j + 1]);
                } else {
                    dp[i][j] = ar[i][j] + Math.max(dp[i][j + 1], Math.max(dp[i - 1][j + 1], dp[i + 1][j + 1]));
                }
            }
        }
        int maxGOLD = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            maxGOLD = Math.max(maxGOLD, dp[i][0]);
        }
        return maxGOLD;
    }
}