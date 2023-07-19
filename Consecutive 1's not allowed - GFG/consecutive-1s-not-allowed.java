//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long countStrings(int n) {
        long[]dp1 = new long[n+1];
        long[]dp2 = new long[n+1];
        dp1[1]=1;
        dp2[1]=1;
        for(int i=2;i<dp1.length;i++){
            dp1[i]=dp1[i-1]%1000000007+dp2[i-1]%1000000007;
            dp2[i]=dp1[i-1]%1000000007;
        }
        return (dp1[n]+dp2[n])%1000000007;
    }
}